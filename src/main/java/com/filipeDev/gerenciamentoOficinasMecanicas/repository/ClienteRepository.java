package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // aqui você pode criar consultas personalizadas (métodos com query derivada)
    List<Cliente> findByNomeContainingIgnoreCase(String nome);
}
