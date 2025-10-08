package models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataPagamento;

    private BigDecimal valorTotal;

    // Relacionamento com Notas de Serviço (uma nota pode ser paga junto com outras)
    @ManyToMany
    @JoinTable(
      name = "pagamento_ordem_servico",
      joinColumns = @JoinColumn(name = "pagamento_id"),
      inverseJoinColumns = @JoinColumn(name = "ordem_servico_id")
    )
    private List<OrdemDeServico> ordensDeServico;



    // Um pagamento pode ter várias formas de pagamento
    @OneToMany(mappedBy = "pagamento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PagamentoForma> pagamentoForma;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDateTime dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<OrdemDeServico> getOrdensDeServico() {
		return ordensDeServico;
	}

	public void setOrdensDeServico(List<OrdemDeServico> ordensDeServico) {
		this.ordensDeServico = ordensDeServico;
	}

	public List<PagamentoForma> getPagamentoForma() {
		return pagamentoForma;
	}

	public void setPagamentoForma(List<PagamentoForma> pagamentoForma) {
		this.pagamentoForma = pagamentoForma;
	}

	public Pagamento(Long id, LocalDateTime dataPagamento, BigDecimal valorTotal, List<OrdemDeServico> ordensDeServico,
			List<PagamentoForma> pagamentoForma) {
		super();
		this.id = id;
		this.dataPagamento = dataPagamento;
		this.valorTotal = valorTotal;
		this.ordensDeServico = ordensDeServico;
		this.pagamentoForma = pagamentoForma;
	}

	public Pagamento() {}

	
    
}
