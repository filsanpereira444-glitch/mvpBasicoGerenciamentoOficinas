package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;        // ex: "Troca de óleo"
    private String descricao;   // detalhes do serviço
    private Double preco;       // valor do serviço

    @Enumerated(EnumType.STRING)
    private TipoDeServico tipoServico; // opcional, para categorizar serviços

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public TipoDeServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoDeServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Servico(String nome, String descricao, Double preco, TipoDeServico tipoServico) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.tipoServico = tipoServico;
	}

	public Servico() {}
    
    
}
