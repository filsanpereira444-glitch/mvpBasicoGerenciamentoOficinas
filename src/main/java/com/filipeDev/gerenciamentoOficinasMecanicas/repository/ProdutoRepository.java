package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // aqui você pode criar consultas personalizadas (métodos com query derivada)
    List<Produto> findByNomeContainingIgnoreCase(String nome);
}
