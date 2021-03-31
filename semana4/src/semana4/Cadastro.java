package semana4;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	private List<Cliente> clientes;

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
//		cadastro.instanceFuncionarioCaixa();
//		cadastro.instanceFuncionarioGerente();
		cadastro.instanceClientes();
	}

	public void instanceFuncionarioCaixa() {

	}

	public void instanceFuncionarioGerente() {

	}

	public void instanceClientes() {
		clientes = new ArrayList<Cliente>();

		Cliente c = new Cliente("Marcos", "(62) 99334-4334", 20, "01102203304", Status.ATIVO);
		clientes.add(c);

		c = new Cliente("Maria", "(62) 88998-9887", 21, "01402403364", Status.ATIVO);
		clientes.add(c);

		c = new Cliente("Helena", "(62) 98776-0923", 22, "09889009865", Status.ATIVO);
		clientes.add(c);

		for (int i = 0; i < clientes.size(); i++) {
			clientes.get(i).exibeDados();
		}
	}

}
