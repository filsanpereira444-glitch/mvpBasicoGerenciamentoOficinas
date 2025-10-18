package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Fatura;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.FaturaRepository;

@Service
public class FaturaService {
    private final FaturaRepository repo;

    public FaturaService(FaturaRepository repo) {
        this.repo = repo;
    }

    public List<Fatura> listar() {
        return repo.findAll();
    }

    public Fatura salvar(Fatura fatura) {
        return repo.save(fatura);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}


