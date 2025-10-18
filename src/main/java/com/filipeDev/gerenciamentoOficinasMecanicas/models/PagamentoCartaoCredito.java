package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class PagamentoCartaoCredito extends PagamentoCartao{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer numeroDeParcelas;
	
	public Double valorDaParcela(Double valorTotal) {
		return valorTotal / numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public PagamentoCartaoCredito() {}
	
	
}
