package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Profissional;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.ProfissionalRepository;

@Service
public class ProfissionalService {
    private final ProfissionalRepository repo;

    public ProfissionalService(ProfissionalRepository repo) {
        this.repo = repo;
    }

    public List<Profissional> listar() {
        return repo.findAll();
    }

    public Profissional salvar(Profissional profissional) {
        return repo.save(profissional);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

