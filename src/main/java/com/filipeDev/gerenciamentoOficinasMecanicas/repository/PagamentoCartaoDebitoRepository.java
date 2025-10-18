package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoCartaoDebito;

public interface PagamentoCartaoDebitoRepository extends JpaRepository<PagamentoCartaoDebito, Long> {

}