package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Carro;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.CarroRepository;

@Service
public class CarroService {
    private final CarroRepository repo;

    public CarroService(CarroRepository repo) {
        this.repo = repo;
    }

    public List<Carro> listar() {
        return repo.findAll();
    }

    public Carro salvar(Carro carro) {
        return repo.save(carro);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

