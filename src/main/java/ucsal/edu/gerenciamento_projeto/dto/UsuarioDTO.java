package ucsal.edu.gerenciamento_projeto.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public class UsuarioDTO {
	private UUID id;
	
	private UUID pessoa_id;
	
	private String password;
	
	private String login;
	
	private OffsetDateTime created_at;
	
	public UsuarioDTO() {
		
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getPessoa_id() {
		return pessoa_id;
	}

	public void setPessoa_id(UUID pessoa_id) {
		this.pessoa_id = pessoa_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public OffsetDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(OffsetDateTime created_at) {
		this.created_at = created_at;
	}

	public OffsetDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(OffsetDateTime updated_at) {
		this.updated_at = updated_at;
	}

	private OffsetDateTime updated_at;
}
