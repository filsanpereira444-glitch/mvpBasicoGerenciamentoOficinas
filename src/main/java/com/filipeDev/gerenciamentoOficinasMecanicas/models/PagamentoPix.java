package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PagamentoPix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
