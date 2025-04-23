package ucsal.edu.gerenciamento_projeto.service;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucsal.edu.gerenciamento_projeto.model.Grupo;
import ucsal.edu.gerenciamento_projeto.repository.GrupoRepository;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    public List<Grupo> listarTodos() {
        return grupoRepository.findAll();
    }

    public Grupo buscarPorId(UUID id) {
        return grupoRepository.findById(id).orElseThrow();
    }

    public Grupo salvar(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public void deletar(UUID id) {
        grupoRepository.deleteById(id);
    }
}