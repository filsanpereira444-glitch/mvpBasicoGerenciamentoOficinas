package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
    // aqui você pode criar consultas personalizadas (métodos com query derivada)
    List<Profissional> findByNomeContainingIgnoreCase(String nome);
}
