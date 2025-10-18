package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "os_item")
public class OsItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Integer quantidade;

    private BigDecimal valorUnitario;

    private BigDecimal valorTotal;

    // Cada item pertence a uma OS
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordem_servico_id")
    private OrdemDeServico ordemDeServico;

    // Identifica se é um produto ou um serviço
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_item")
    private TipoItem tipoItem;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public OrdemDeServico getOrdemDeServico() {
		return ordemDeServico;
	}
	public void setOrdemDeServico(OrdemDeServico ordemDeServico) {
		this.ordemDeServico = ordemDeServico;
	}
	
	public TipoItem getTipoItem() {
		return tipoItem;
	}
	public void setTipoItem(TipoItem tipoItem) {
		this.tipoItem = tipoItem;
	}
	
	public OsItem(Long id, String descricao, Integer quantidade, BigDecimal valorUnitario, BigDecimal valorTotal,
			OrdemDeServico ordemDeServico, TipoItem tipoItem) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.ordemDeServico = ordemDeServico;
		this.tipoItem = tipoItem;
	}
	public OsItem() {}


    
    
}