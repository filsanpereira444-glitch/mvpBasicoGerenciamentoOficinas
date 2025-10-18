package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoCartao;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoCartaoRepository;

@Service
public class PagamentoCartaoService {
    private final PagamentoCartaoRepository repo;

    public PagamentoCartaoService(PagamentoCartaoRepository repo) {
        this.repo = repo;
    }

    public List<PagamentoCartao> listar() {
        return repo.findAll();
    }

    public PagamentoCartao salvar(PagamentoCartao pagamentoCartao) {
        return repo.save(pagamentoCartao);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}


