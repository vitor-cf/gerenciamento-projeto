package ucsal.edu.gerenciamento_projeto.controller;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucsal.edu.gerenciamento_projeto.model.Grupo;
import ucsal.edu.gerenciamento_projeto.service.GrupoService;

@RestController
@RequestMapping("/api/grupos")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @GetMapping
    public List<Grupo> listar() {
        return grupoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Grupo buscar(@PathVariable UUID id) {
        return grupoService.buscarPorId(id);
    }

    @PostMapping
    public Grupo criar(@RequestBody Grupo grupo) {
        return grupoService.salvar(grupo);
    }

    @PutMapping("/{id}")
    public Grupo atualizar(@PathVariable UUID id, @RequestBody Grupo grupo) {
        grupo.setId(id);
        return grupoService.salvar(grupo);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable UUID id) {
        grupoService.deletar(id);
    }
}