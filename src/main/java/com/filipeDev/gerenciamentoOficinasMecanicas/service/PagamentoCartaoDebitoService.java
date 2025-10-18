package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoCartaoDebito;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoCartaoDebitoRepository;

@Service
public class PagamentoCartaoDebitoService {
    private final PagamentoCartaoDebitoRepository repo;

    public PagamentoCartaoDebitoService(PagamentoCartaoDebitoRepository repo) {
        this.repo = repo;
    }

    public List<PagamentoCartaoDebito> listar() {
        return repo.findAll();
    }

    public PagamentoCartaoDebito salvar(PagamentoCartaoDebito pagamentoCartaoDebito) {
        return repo.save(pagamentoCartaoDebito);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

