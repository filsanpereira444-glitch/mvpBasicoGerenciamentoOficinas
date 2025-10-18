package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoDeposito;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoDepositoRepository;

@Service
public class PagamentoDepositoService {
    private final PagamentoDepositoRepository repo;

    public PagamentoDepositoService(PagamentoDepositoRepository repo) {
        this.repo = repo;
    }

    public List<PagamentoDeposito> listar() {
        return repo.findAll();
    }

    public PagamentoDeposito salvar(PagamentoDeposito pagamentoDeposito) {
        return repo.save(pagamentoDeposito);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}


