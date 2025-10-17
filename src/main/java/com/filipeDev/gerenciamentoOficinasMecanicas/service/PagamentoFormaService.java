package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoForma;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoFormaRepository;

@Service
public class PagamentoFormaService {
    private final PagamentoFormaRepository repo;

    public PagamentoFormaService(PagamentoFormaRepository repo) {
        this.repo = repo;
    }

    public List<PagamentoForma> listar() {
        return repo.findAll();
    }

    public PagamentoForma salvar(PagamentoForma pagamentoForma) {
        return repo.save(pagamentoForma);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

