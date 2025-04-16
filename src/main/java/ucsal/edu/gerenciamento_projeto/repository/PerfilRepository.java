package ucsal.edu.gerenciamento_projeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ucsal.edu.gerenciamento_projeto.model.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil,UUID> {

}
