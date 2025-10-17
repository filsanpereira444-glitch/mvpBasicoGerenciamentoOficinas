package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Pagamento;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoRepository;

@Service
public class PagamentoService {
    private final PagamentoRepository repo;

    public PagamentoService(PagamentoRepository repo) {
        this.repo = repo;
    }

    public List<Pagamento> listar() {
        return repo.findAll();
    }

    public Pagamento salvar(Pagamento pagamento) {
        return repo.save(pagamento);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

