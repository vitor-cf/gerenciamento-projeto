package ucsal.edu.gerenciamento_projeto.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import ucsal.edu.gerenciamento_projeto.dto.CriarUsuarioRequest;
import ucsal.edu.gerenciamento_projeto.dto.PessoaDTO;
import ucsal.edu.gerenciamento_projeto.dto.UsuarioDTO;
import ucsal.edu.gerenciamento_projeto.model.Perfil;
import ucsal.edu.gerenciamento_projeto.model.Pessoa;
import ucsal.edu.gerenciamento_projeto.model.Usuario;
import ucsal.edu.gerenciamento_projeto.repository.PerfilRepository;
import ucsal.edu.gerenciamento_projeto.repository.PessoaRepository;
import ucsal.edu.gerenciamento_projeto.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private PerfilRepository perfilRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public List<Usuario> listarTodos() {
		return usuarioRepository.findAll();
	}
	
	@Transactional
	public Usuario salvar(CriarUsuarioRequest request) {
		PessoaDTO pessoaDTO = request.getPessoa();
		UsuarioDTO usuarioDTO = request.getUsuario();
		
		// Buscar perfil
		Perfil perfil = perfilRepository.findById(pessoaDTO.getPerfil_id())
				.orElseThrow(() -> new RuntimeException("Perfil não encontrado"));
		
		// Criar pessoa
		Pessoa pessoa = new Pessoa();
		pessoa.setId(UUID.randomUUID());
		pessoa.setNome(pessoaDTO.getNome());
		pessoa.setEmail_institucional(pessoaDTO.getEmail_institucional());
		pessoa.setEscola_departamento(pessoaDTO.getEscola_departamento());
		pessoa.setPerfil_id(perfil);
		
		pessoa = pessoaRepository.save(pessoa);
		
		// Criar usuário
		Usuario usuario = new Usuario();
		usuario.setId(UUID.randomUUID());
		usuario.setLogin(usuarioDTO.getLogin());
		
		// Encriptar senha
		String senhaCriptografada = passwordEncoder.encode(usuarioDTO.getPassword());
		usuario.setPassword(senhaCriptografada);
		usuario.setPessoa_id(pessoa);
		
		return usuarioRepository.save(usuario);
	}

	public void deletar(UUID id) {
		usuarioRepository.deleteById(id);
	}


}
