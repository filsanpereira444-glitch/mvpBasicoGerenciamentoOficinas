package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoPix;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoPixRepository;

@Service
public class PagamentoPixService {
    private final PagamentoPixRepository repo;

    public PagamentoPixService(PagamentoPixRepository repo) {
        this.repo = repo;
    }

    public List<PagamentoPix> listar() {
        return repo.findAll();
    }

    public PagamentoPix salvar(PagamentoPix pagamentoPix) {
        return repo.save(pagamentoPix);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}


