package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
   
}
