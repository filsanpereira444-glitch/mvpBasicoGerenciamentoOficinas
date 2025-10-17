package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoForma;

public interface PagamentoFormaRepository extends JpaRepository<PagamentoForma, Long> {
   
}