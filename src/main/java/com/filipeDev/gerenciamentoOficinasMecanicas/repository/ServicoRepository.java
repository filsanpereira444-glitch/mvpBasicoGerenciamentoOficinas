package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    // aqui você pode criar consultas personalizadas (métodos com query derivada)
    List<Servico> findByNomeContainingIgnoreCase(String nome);
}