package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.OsItem;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.OsItemRepository;

@Service
public class OsItemService {
    private final OsItemRepository repo;

    public OsItemService(OsItemRepository repo) {
        this.repo = repo;
    }

    public List<OsItem> listar() {
        return repo.findAll();
    }

    public OsItem salvar(OsItem osItem) {
        return repo.save(osItem);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
