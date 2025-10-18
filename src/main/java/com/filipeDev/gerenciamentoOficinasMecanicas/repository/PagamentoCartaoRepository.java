package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.PagamentoCartao;

public interface PagamentoCartaoRepository extends JpaRepository<PagamentoCartao, Long> {

}
