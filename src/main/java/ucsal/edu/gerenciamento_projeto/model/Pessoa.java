package ucsal.edu.gerenciamento_projeto.model;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table; 

@Entity
@Table(name = "pessoas")
public class Pessoa {
	
	@Id
	private UUID id;
	
	@Column(name = "nome", length = 150, nullable = false, unique = false)
	private String nome;
	
	@Column(name = "email_institucional", length = 100, nullable = false, unique = true)
	private String email_institucional;
	
	@Column(name = "escola_departamento", length = 100)
	private String escola_departamento;
	
	@ManyToOne
	@JoinColumn(name = "perfil_id", nullable = false)
	private Perfil perfil_id;
	
	@CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)
	private OffsetDateTime created_at;
	
	@UpdateTimestamp
	@Column(name = "update_at", nullable = false)
	private OffsetDateTime updated_at;
	
	
	public Pessoa() {
		
	}


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
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


	public Perfil getPerfil_id() {
		return perfil_id;
	}


	public void setPerfil_id(Perfil perfil_id) {
		this.perfil_id = perfil_id;
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
	
	
}
