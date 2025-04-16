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
@Table(name = "usuarios")
public class Usuario {
	@Id
	private UUID id;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id", nullable = false)
	private Pessoa pessoa_id;
	
	@Column(name = "password", nullable = false)
	private String password; 
	
	@Column(name = "login", nullable = false)
	private String login;
	
	@CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)
	private OffsetDateTime created_at;
	
	@UpdateTimestamp
	@Column(name = "upated_at", nullable = false)
	private OffsetDateTime updated_at;
	
	public Usuario() {
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Pessoa getPessoa_id() {
		return pessoa_id;
	}

	public void setPessoa_id(Pessoa pessoa_id) {
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
	
	
}
