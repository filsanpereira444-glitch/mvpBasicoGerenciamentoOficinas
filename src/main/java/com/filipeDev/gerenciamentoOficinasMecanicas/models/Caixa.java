package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Caixa {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double total;
	private double totalCartoes;
	private double totalPix;
	private double totalDinheiro;
	private double totalCheque;
	private double totalDeposito;
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getTotalCartoes() {
		return totalCartoes;
	}
	public void setTotalCartoes(double totalCartoes) {
		this.totalCartoes = totalCartoes;
	}
	public double getTotalPix() {
		return totalPix;
	}
	public void setTotalPix(double totalPix) {
		this.totalPix = totalPix;
	}
	public double getTotalDinheiro() {
		return totalDinheiro;
	}
	public void setTotalDinheiro(double totalDinheiro) {
		this.totalDinheiro = totalDinheiro;
	}
	public double getTotalCheque() {
		return totalCheque;
	}
	public void setTotalCheque(double totalCheque) {
		this.totalCheque = totalCheque;
	}
	public double getTotalDeposito() {
		return totalDeposito;
	}
	public void setTotalDeposito(double totalDeposito) {
		this.totalDeposito = totalDeposito;
	}
	public Caixa() {}
	
	
	
	
}
