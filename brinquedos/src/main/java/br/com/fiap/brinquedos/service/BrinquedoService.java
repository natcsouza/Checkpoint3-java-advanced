package br.com.fiap.brinquedos.service;

import br.com.fiap.brinquedos.model.Brinquedo;
import br.com.fiap.brinquedos.repository.BrinquedoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    private final BrinquedoRepository repository;

    public BrinquedoService(BrinquedoRepository repository) {
        this.repository = repository;
    }

    public List<Brinquedo> listarTodos() {
        return repository.findAll();
    }

    public Optional<Brinquedo> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Brinquedo salvar(Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    public Brinquedo atualizar(Long id, Brinquedo brinquedoAtualizado) {

        return repository.findById(id)
                .map(brinquedo -> {

                    brinquedo.setNome(brinquedoAtualizado.getNome());
                    brinquedo.setTipo(brinquedoAtualizado.getTipo());
                    brinquedo.setClassificacao(brinquedoAtualizado.getClassificacao());
                    brinquedo.setTamanho(brinquedoAtualizado.getTamanho());
                    brinquedo.setPreco(brinquedoAtualizado.getPreco());

                    return repository.save(brinquedo);

                }).orElse(null);

    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

}