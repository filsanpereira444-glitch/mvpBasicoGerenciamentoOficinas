package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.OrdemDeServico;

public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Long> {
   
}
