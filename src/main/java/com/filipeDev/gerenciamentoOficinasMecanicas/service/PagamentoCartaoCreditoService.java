package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoCartaoCredito;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoCartaoCreditoRepository;

@Service
public class PagamentoCartaoCreditoService {
    private final PagamentoCartaoCreditoRepository repo;

    public PagamentoCartaoCreditoService(PagamentoCartaoCreditoRepository repo) {
        this.repo = repo;
    }

    public List<PagamentoCartaoCredito> listar() {
        return repo.findAll();
    }

    public PagamentoCartaoCredito salvar(PagamentoCartaoCredito pagamentoCartaoCredito) {
        return repo.save(pagamentoCartaoCredito);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}


