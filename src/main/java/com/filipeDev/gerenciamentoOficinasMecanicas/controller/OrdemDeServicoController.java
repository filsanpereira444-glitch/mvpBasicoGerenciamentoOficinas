package com.filipeDev.gerenciamentoOficinasMecanicas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.OrdemDeServico;
import com.filipeDev.gerenciamentoOficinasMecanicas.service.OrdemDeServicoService;

@RestController
@RequestMapping("/ordemDeServico")
public class OrdemDeServicoController {

	private final OrdemDeServicoService service;

	public OrdemDeServicoController(OrdemDeServicoService service) {
	        this.service = service;
	    }

	@GetMapping
	public List<OrdemDeServico> listar() {
		return service.listar();
	}

	@PostMapping
	public OrdemDeServico criar(@RequestBody OrdemDeServico ordemDeServico) {
		return service.salvar(ordemDeServico);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
}
