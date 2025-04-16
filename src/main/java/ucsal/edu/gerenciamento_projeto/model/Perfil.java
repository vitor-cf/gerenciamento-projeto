package ucsal.edu.gerenciamento_projeto.model;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity
@Table(name = "perfil")
public class Perfil {
	
	@Id
	private UUID id;
	
	@Column(name = "nome", length = 50, nullable = false, unique = true)
	private String nome;
	
	public Perfil() {
		
	}
	
	public Perfil(UUID id, String nome) {
		this.id = id;
		this.nome = nome;
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
	
	
	
}
