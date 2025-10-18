package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoCheque;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoChequeRepository;

@Service
public class PagamentoChequeService {
    private final PagamentoChequeRepository repo;

    public PagamentoChequeService(PagamentoChequeRepository repo) {
        this.repo = repo;
    }

    public List<PagamentoCheque> listar() {
        return repo.findAll();
    }

    public PagamentoCheque salvar(PagamentoCheque pagamentoCheque) {
        return repo.save(pagamentoCheque);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}


