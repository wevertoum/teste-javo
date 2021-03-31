package semana4;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	private List<Cliente> clientes;

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		cadastro.instanceFuncionarioCaixa();
		cadastro.instanceFuncionarioGerente();
		cadastro.instanceClientes();
	}

	public void instanceFuncionarioCaixa() {
		System.out.println("\n ----------- FUNCIONARIO CAIXA ----------- \n");
		Caixa caixa = new Caixa("Juliano", "(62) 77886-6555", "1111", 2000.00, 8, 10);
		caixa.aumentaSalario();
		caixa.exibeDados();

	}

	public void instanceFuncionarioGerente() {
		System.out.println("----------- FUNCIONARIO GERENTE ----------- \n");
		Gerente gerente = new Gerente("Fernando", "(62) 98778-6888", "2222", 5000.00, 200.00, TipoPessoa.PJ, 20);
		gerente.aumentaSalario();
		gerente.exibeDados();

	}

	public void instanceClientes() {
		System.out.println("----------- INSTANCE CLIENTES ----------- \n");
		clientes = new ArrayList<Cliente>();

		Cliente cliente = new Cliente("Marcos", "(62) 99334-4334", 20, "01102203304", Status.ATIVO);
		clientes.add(cliente);

		cliente = new Cliente("Maria", "(62) 88998-9887", 21, "01402403364", Status.ATIVO);
		clientes.add(cliente);

		cliente = new Cliente("Helena", "(62) 98776-0923", 22, "09889009865", Status.ATIVO);
		cliente.desativar();
		clientes.add(cliente);

		for (int i = 0; i < clientes.size(); i++) {
			clientes.get(i).exibeDados();
		}
	}

}
