package ucsal.edu.gerenciamento_projeto.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ucsal.edu.gerenciamento_projeto.model.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, UUID> {
}
