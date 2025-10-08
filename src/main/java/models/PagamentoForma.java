package models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pagamento_forma")
public class PagamentoForma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento")
    private FormaDePagamento formaDePagamento;

    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "pagamento_id")
    private Pagamento pagamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public PagamentoForma(Long id, FormaDePagamento formaDePagamento, BigDecimal valor, Pagamento pagamento) {
		super();
		this.id = id;
		this.formaDePagamento = formaDePagamento;
		this.valor = valor;
		this.pagamento = pagamento;
	}

	public PagamentoForma() {}

    
}