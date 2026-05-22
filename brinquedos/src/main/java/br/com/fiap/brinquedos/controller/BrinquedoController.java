package br.com.fiap.brinquedos.controller;

import br.com.fiap.brinquedos.model.Brinquedo;
import br.com.fiap.brinquedos.service.BrinquedoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    private final BrinquedoService service;

    public BrinquedoController(BrinquedoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Brinquedo> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Brinquedo> cadastrar(@RequestBody @Valid Brinquedo brinquedo) {
        Brinquedo novoBrinquedo = service.salvar(brinquedo);
        return ResponseEntity.ok(novoBrinquedo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Brinquedo> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid Brinquedo brinquedo) {

        Brinquedo atualizado = service.atualizar(id, brinquedo);

        if (atualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}