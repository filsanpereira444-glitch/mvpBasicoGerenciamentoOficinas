package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class OrdemDeServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carro_id")
    private Carro carro;

    @Enumerated(EnumType.STRING)
    private StatusOS status;
    
    private Double valorTotal = 0.0;

    @OneToMany(mappedBy = "ordemDeServico", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<OsItem> itens;

    
    @ManyToMany(mappedBy = "ordensDeServico", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pagamento> pagamentos;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Carro getCarro() {
		return carro;
	}


	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	public StatusOS getStatus() {
		return status;
	}


	public void setStatus(StatusOS status) {
		this.status = status;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public List<OsItem> getItens() {
		return itens;
	}


	public void setItens(List<OsItem> itens) {
		this.itens = itens;
	}


	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}


	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}


	public OrdemDeServico(Long id, Cliente cliente, Carro carro, StatusOS status, Double valorTotal, List<OsItem> itens,
			List<Pagamento> pagamentos) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.carro = carro;
		this.status = status;
		this.valorTotal = valorTotal;
		this.itens = itens;
		this.pagamentos = pagamentos;
	}


	public OrdemDeServico() {}

    
    

}

