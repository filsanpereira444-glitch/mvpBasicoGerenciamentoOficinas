package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoPrevisto;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoPrevistoRepository;

@Service
public class PagamentoPrevistoService {
    private final PagamentoPrevistoRepository repo;

    public PagamentoPrevistoService(PagamentoPrevistoRepository repo) {
        this.repo = repo;
    }

    public List<PagamentoPrevisto> listar() {
        return repo.findAll();
    }

    public PagamentoPrevisto salvar(PagamentoPrevisto pagamentoPrevisto) {
        return repo.save(pagamentoPrevisto);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}


