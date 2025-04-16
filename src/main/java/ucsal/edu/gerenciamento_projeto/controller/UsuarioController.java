package ucsal.edu.gerenciamento_projeto.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucsal.edu.gerenciamento_projeto.dto.CriarUsuarioRequest;
import ucsal.edu.gerenciamento_projeto.model.Usuario;
import ucsal.edu.gerenciamento_projeto.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> listarTodos() {
		return usuarioService.listarTodos();
	}
	
	@PostMapping
	public Usuario criar(@RequestBody CriarUsuarioRequest request) {
		return usuarioService.salvar(request);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable UUID id) {
		usuarioService.deletar(id);
		return ResponseEntity.noContent().build();
	}
}
