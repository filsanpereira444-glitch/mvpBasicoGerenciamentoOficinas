package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Servico;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.ServicoRepository;

@Service
public class ServicoService {
    private final ServicoRepository repo;

    public ServicoService(ServicoRepository repo) {
        this.repo = repo;
    }

    public List<Servico> listar() {
        return repo.findAll();
    }

    public Servico salvar(Servico servico) {
        return repo.save(servico);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}


