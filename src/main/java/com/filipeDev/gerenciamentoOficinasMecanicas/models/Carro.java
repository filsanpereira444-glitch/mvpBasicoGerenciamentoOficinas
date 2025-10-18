package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Carro {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String placa;
	
	@Enumerated(EnumType.STRING) 
	private Cor cor; 
	
	@Enumerated(EnumType.STRING)
	private Montadora montadora;


	private String modelo; 
	private String frota;
	private String observacoes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Montadora getMontadora() {
		return montadora;
	}

	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFrota() {
		return frota;
	}

	public void setFrota(String frota) {
		this.frota = frota;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro(String placa, Cor cor, Montadora montadora, String modelo, String frota, String observacoes,
			Cliente cliente) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.montadora = montadora;
		this.modelo = modelo;
		this.frota = frota;
		this.observacoes = observacoes;
		this.cliente = cliente;
	}
	
	public Carro() {}
}
