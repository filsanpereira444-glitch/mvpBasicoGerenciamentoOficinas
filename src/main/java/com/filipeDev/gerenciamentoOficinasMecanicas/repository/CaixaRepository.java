package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Caixa;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.Carro;

public interface CaixaRepository extends JpaRepository<Caixa, Long> {

}
