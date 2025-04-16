package ucsal.edu.gerenciamento_projeto.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public class PessoaDTO {
	private UUID id;
	
	private UUID perfil_id;
	
	private String nome;
	
	private String email_institucional;
	
	private String escola_departamento;
	
	private OffsetDateTime created_at;
	
	public PessoaDTO() {
		
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getPerfil_id() {
		return perfil_id;
	}

	public void setPerfil_id(UUID perfil_id) {
		this.perfil_id = perfil_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail_institucional() {
		return email_institucional;
	}

	public void setEmail_institucional(String email_institucional) {
		this.email_institucional = email_institucional;
	}

	public String getEscola_departamento() {
		return escola_departamento;
	}

	public void setEscola_departamento(String escola_departamento) {
		this.escola_departamento = escola_departamento;
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
