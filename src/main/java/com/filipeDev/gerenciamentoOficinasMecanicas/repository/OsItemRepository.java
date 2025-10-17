package com.filipeDev.gerenciamentoOficinasMecanicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.OsItem;

public interface OsItemRepository extends JpaRepository<OsItem, Long> {
   
}
