package models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String telefone;
    private String email;
    private String cpfCnpj;
    private String endereco;
    
    @Enumerated(EnumType.STRING)
    private StatusCliente statuscliente;
    
    @OneToMany(mappedBy = "cliente")
    private List<Carro> carros;
    
    @OneToMany(mappedBy = "cliente")
    private List<OrdemDeServico> ordens;

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public StatusCliente getStatuscliente() {
		return statuscliente;
	}

	public void setStatuscliente(StatusCliente statuscliente) {
		this.statuscliente = statuscliente;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public List<OrdemDeServico> getOrdens() {
		return ordens;
	}

	public void setOrdens(List<OrdemDeServico> ordens) {
		this.ordens = ordens;
	}

	public Cliente(Long id, String nome, String telefone, String email, String cpfCnpj, String endereco,
			StatusCliente statuscliente, List<Carro> carros, List<OrdemDeServico> ordens) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cpfCnpj = cpfCnpj;
		this.endereco = endereco;
		this.statuscliente = statuscliente;
		this.carros = carros;
		this.ordens = ordens;
	}

	public Cliente() {}
    
    
}
