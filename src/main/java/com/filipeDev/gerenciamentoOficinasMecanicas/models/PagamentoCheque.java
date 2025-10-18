package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PagamentoCheque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer agencia;
	private Integer numeroDoCheque;
	private LocalDate dataDeVencimento;
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumeroDoCheque() {
		return numeroDoCheque;
	}
	public void setNumeroDoCheque(Integer numeroDoCheque) {
		this.numeroDoCheque = numeroDoCheque;
	}
	public LocalDate getDataDeVencimento() {
		return dataDeVencimento;
	}
	public void setDataDeVencimento(LocalDate dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}
	public PagamentoCheque(Integer agencia, Integer numeroDoCheque, LocalDate dataDeVencimento) {
		super();
		this.agencia = agencia;
		this.numeroDoCheque = numeroDoCheque;
		this.dataDeVencimento = dataDeVencimento;
	}
	public PagamentoCheque() {}
	
	
}
