package ucsal.edu.gerenciamento_projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucsal.edu.gerenciamento_projeto.model.Projeto;
import ucsal.edu.gerenciamento_projeto.repository.ProjetoRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto salvar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public List<Projeto> listarTodos() {
        return projetoRepository.findAll();
    }

    public Optional<Projeto> buscarPorId(UUID id) {
        return projetoRepository.findById(id);
    }

    public void deletar(UUID id) {
        projetoRepository.deleteById(id);
    }
}