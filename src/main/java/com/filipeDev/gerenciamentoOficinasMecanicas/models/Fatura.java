package com.filipeDev.gerenciamentoOficinasMecanicas.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataEmissao;
    private BigDecimal valorTotal;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "caixa_id")
	private Caixa caixa;
    
    @Enumerated(EnumType.STRING) 
	private StatusFatura statusFatura;

}

