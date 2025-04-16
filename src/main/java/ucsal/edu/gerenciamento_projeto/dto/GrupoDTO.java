package ucsal.edu.gerenciamento_projeto.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public class GrupoDTO {
	private UUID id;
	
	private String nome;
	
	private UUID coordenador_id;

	private boolean ativo;

	private String descricao;
	
	private OffsetDateTime created_at;
	
	private OffsetDateTime updated_at;
	
	public GrupoDTO() {
		
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
