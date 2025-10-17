package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.OrdemDeServico;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.OrdemDeServicoRepository;

@Service
public class OrdemDeServicoService {
    private final OrdemDeServicoRepository repo;

    public OrdemDeServicoService(OrdemDeServicoRepository repo) {
        this.repo = repo;
    }

    public List<OrdemDeServico> listar() {
        return repo.findAll();
    }

    public OrdemDeServico salvar(OrdemDeServico ordemDeServico) {
        return repo.save(ordemDeServico);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

