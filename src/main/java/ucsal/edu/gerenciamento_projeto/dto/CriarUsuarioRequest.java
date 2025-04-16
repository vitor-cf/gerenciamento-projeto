package ucsal.edu.gerenciamento_projeto.dto;

public class CriarUsuarioRequest {
	private PessoaDTO pessoa;
	private UsuarioDTO usuario;
	
	public CriarUsuarioRequest() {
		
	}

	public PessoaDTO getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaDTO pessoa) {
		this.pessoa = pessoa;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	
	
}
