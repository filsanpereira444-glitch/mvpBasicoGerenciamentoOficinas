package com.filipeDev.gerenciamentoOficinasMecanicas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Produto;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.ProdutoRepository;

@Service
public class ProdutoService {
    private final ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo) {
        this.repo = repo;
    }

    public List<Produto> listar() {
        return repo.findAll();
    }

    public Produto salvar(Produto produto) {
        return repo.save(produto);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
