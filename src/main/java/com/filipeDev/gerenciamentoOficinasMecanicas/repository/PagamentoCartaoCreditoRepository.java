package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoCartaoCredito;

public interface PagamentoCartaoCreditoRepository extends JpaRepository<PagamentoCartaoCredito, Long> {

}
