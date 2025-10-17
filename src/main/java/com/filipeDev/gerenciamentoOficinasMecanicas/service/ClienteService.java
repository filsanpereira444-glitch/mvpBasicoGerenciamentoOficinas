package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Cliente;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public List<Cliente> listar() {
        return repo.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return repo.save(cliente);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

