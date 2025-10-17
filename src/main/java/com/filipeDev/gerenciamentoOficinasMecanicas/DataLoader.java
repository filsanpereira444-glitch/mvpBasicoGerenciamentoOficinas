package com.filipeDev.gerenciamentoOficinasMecanicas;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.filipeDev.gerenciamentoOficinasMecanicas.models.Carro;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.Cliente;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.Cor;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.Montadora;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.OrdemDeServico;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.OsItem;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.Pagamento;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.Produto;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.Profissional;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.Servico;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.StatusCliente;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.TipoDeServico;
import com.filipeDev.gerenciamentoOficinasMecanicas.models.UnidadeDeMedida;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.CarroRepository;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.ClienteRepository;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.OrdemDeServicoRepository;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.OsItemRepository;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.PagamentoRepository;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.ProdutoRepository;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.ProfissionalRepository;
import com.filipeDev.gerenciamentoOficinasMecanicas.repository.ServicoRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final ClienteRepository clienteRepository;
    private final ProfissionalRepository profissionalRepository;
    private final ProdutoRepository produtoRepository;
    private final ServicoRepository servicoRepository;
    private final CarroRepository carroRepository;
    private final OrdemDeServicoRepository ordemRepository;
    private final OsItemRepository osItemRepository;
    private final PagamentoRepository pagamentoRepository;

    public DataLoader(
            ClienteRepository clienteRepository,
            ProfissionalRepository profissionalRepository,
            ProdutoRepository produtoRepository,
            ServicoRepository servicoRepository,
            CarroRepository carroRepository,
            OrdemDeServicoRepository ordemRepository,
            OsItemRepository osItemRepository,
            PagamentoRepository pagamentoRepository
    ) {
        this.clienteRepository = clienteRepository;
        this.profissionalRepository = profissionalRepository;
        this.produtoRepository = produtoRepository;
        this.servicoRepository = servicoRepository;
        this.carroRepository = carroRepository;
        this.ordemRepository = ordemRepository;
        this.osItemRepository = osItemRepository;
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // === CLIENTES ===
        Cliente joao = new Cliente("João da Silva", "1199999999", "joao@email.com", "21433354748", "Moises Augusto do Vale, 240", StatusCliente.ATIVO);
        Cliente maria = new Cliente("Maria Madalena", "1199988888", "maria@email.com", "21526514585", "Águas Raras, 80", StatusCliente.ATIVO);
        clienteRepository.saveAll(List.of(joao, maria));

        // === PROFISSIONAIS ===
        Profissional carlos = new Profissional("Carlos Silva", "2299985858", "carlos@gmail.com", "");
        Profissional luiz = new Profissional("Luiz Emanuel", "2299946857", "luiz@gmail.com", "");
        profissionalRepository.saveAll(List.of(carlos, luiz));

        // === PRODUTOS ===
        Produto oleo = new Produto("Óleo do motor", "", 25.00, 5, "00001", UnidadeDeMedida.UN);
        Produto filtro = new Produto("Filtro Ar", "", 25.00, 5, "00002", UnidadeDeMedida.UN);
        produtoRepository.saveAll(List.of(oleo, filtro));

        // === SERVIÇOS ===
        Servico trocaOleo = new Servico("Troca de óleo", "", 50.0, TipoDeServico.MECANICA);
        Servico trocaFiltro = new Servico("Troca de filtro", "", 50.0, TipoDeServico.MECANICA);
        servicoRepository.saveAll(List.of(trocaOleo, trocaFiltro));

        // === CARROS ===
        Carro carroJoao = new Carro("ABC-1234", Cor.AMARELO, Montadora.VOLKSWAGEN,"24.250", "", "",joao);
        Carro carroMaria = new Carro("DEF-5678", Cor.AZUL, Montadora.CHEVROLET,"D20", "", "",maria);
        carroRepository.saveAll(List.of(carroJoao, carroMaria));

        // === ORDEM DE SERVIÇO ===
        OrdemDeServico os1 = new OrdemDeServico();
        os1.setCliente(joao);
        os1.setCarro(carroJoao);
        ordemRepository.save(os1);

        // === ITENS DA OS ===
        OsItem item1 = new OsItem();
        item1.setOrdemDeServico(os1);
        item1.setProfissional(carlos);
        item1.setServico(trocaOleo);
        item1.setProduto(oleo);
        item1.setQuantidade(1);
        item1.setValorUnitario(new BigDecimal("35.00"));
        osItemRepository.save(item1);

        OsItem item2 = new OsItem();
        item2.setOrdemDeServico(os1);
        item2.setProfissional(luiz);
        item2.setServico(trocaFiltro);
        item2.setProduto(filtro);
        item2.setQuantidade(1);
        item2.setValorUnitario(new BigDecimal("45.00"));
        osItemRepository.save(item2);

        // === PAGAMENTO ===
        Pagamento pagamento = new Pagamento();
        pagamento.setDataPagamento(LocalDateTime.now());
        pagamento.setValorTotal(new BigDecimal("80.00"));
        //Criando List e adicionando os
        List<OrdemDeServico> oss = new ArrayList<>();
        oss.add(os1);
        pagamento.setOrdensDeServico(oss);
        pagamentoRepository.save(pagamento);

        System.out.println("✅ Dados de teste carregados com sucesso!");
    }
}
