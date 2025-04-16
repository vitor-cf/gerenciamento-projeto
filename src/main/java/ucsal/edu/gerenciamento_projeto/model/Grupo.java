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
@Table(name = "grupos")
public class Grupo {

	@Id
	private UUID id;
	
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	
	@JoinColumn(name = "coordenador_id")
	private UUID coordenador_id;

	@Column(name = "ativo", nullable = false)
	private boolean ativo;

	@Column(name = "descricao")
	private String descricao;
	
	@CreationTimestamp
	@Column(name="created_at", nullable = false, updatable = false)
	private OffsetDateTime created_at;
	
	@UpdateTimestamp
	@Column(name="updated_at", nullable = false)
	private OffsetDateTime updated_at;
	
	public Grupo() {
		
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

	public UUID getCoordenador_id() {
		return coordenador_id;
	}

	public void setCoordenador_id(UUID coordenador_id) {
		this.coordenador_id = coordenador_id;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
