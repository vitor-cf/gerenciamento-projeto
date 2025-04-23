package ucsal.edu.gerenciamento_projeto.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucsal.edu.gerenciamento_projeto.model.Projeto;
import ucsal.edu.gerenciamento_projeto.service.ProjetoService;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<Projeto> criarProjeto(@RequestBody Projeto projeto) {
        return ResponseEntity.ok(projetoService.salvar(projeto));
    }

    @GetMapping
    public ResponseEntity<List<Projeto>> listarProjetos() {
        return ResponseEntity.ok(projetoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projeto> buscarPorId(@PathVariable UUID id) {
        Optional<Projeto> projeto = projetoService.buscarPorId(id);
        return projeto.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        projetoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Projeto> atualizar(@PathVariable UUID id, @RequestBody Projeto projeto) {
        Optional<Projeto> existente = projetoService.buscarPorId(id);
        if (existente.isPresent()) {
            Projeto atualizado = projeto;
            atualizado.setId(id);
            return ResponseEntity.ok(projetoService.salvar(atualizado));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}