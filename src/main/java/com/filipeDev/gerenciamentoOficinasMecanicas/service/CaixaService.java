package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Caixa;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.CaixaRepository;

@Service
public class CaixaService {
    private final CaixaRepository repo;

    public CaixaService(CaixaRepository repo) {
        this.repo = repo;
    }

    public List<Caixa> listar() {
        return repo.findAll();
    }

    public Caixa salvar(Caixa caixa) {
        return repo.save(caixa);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}