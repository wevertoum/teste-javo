package management;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Principal {

	private List<Funcionario> funcionarios;

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.showInitialData();
	}

	public void showInitialData() {
		funcionarios = new ArrayList<Funcionario>();

		Funcionario func = new Funcionario("Joao", "03183101203", 1);
		Funcionario funcSalario = new Funcionario(5000);
		funcSalario.salario = funcSalario.salario;

		Endereco end = new Endereco("Rua das gracas", 1022);
		func.Endereco = end;
		System.out.println("<< DADOS INICIAIS >>" + "\n" + "nome: " + func.nome + "\n" + "cpf: " + func.cpf + "\n"
				+ "matricula: " + func.matricula + "\n" + "rua: " + func.Endereco.rua + "\n" + "numero: "
				+ func.Endereco.numero + "\n" + "salario alterado " + aumentaSalario(funcSalario.salario, 10));

		cadastraFuncionarios();
	}

	private void cadastraFuncionarios() {
		boolean cadastrando = true;

		while (cadastrando) {
			Funcionario func = new Funcionario();

			JTextField cpf = new JTextField();
			JTextField matricula = new JTextField();
			JTextField nome = new JTextField();
			JTextField cargo = new JTextField();
			JTextField salario = new JTextField();
			JTextField departamento = new JTextField();
			JTextField rua = new JTextField();
			JTextField numero = new JTextField();

			Object[] fields = { "CPF (somente numeros)", cpf, "Matricula (somente numeros)", matricula,
					"Informe o nome", nome, "Informe o cargo", cargo, "Salario (somente numeros)", salario,
					"Informe o departamento", departamento, "Informe a rua", rua, "Nº casa (somente numeros)",
					numero, };

			int result = JOptionPane.showConfirmDialog(null, fields, "Cancel: exibir lista, OK: Salvar",
					JOptionPane.OK_CANCEL_OPTION);

			String mat = matricula.getText();
			String sal = salario.getText();

			func.setCpf(cpf.getText());

			if (mat != null && !mat.isEmpty()) {
				func.setMatricula(Integer.parseInt(mat));
			}

			func.setNome(nome.getText());
			func.setCargo(cargo.getText());

			if (sal != null && !sal.isEmpty()) {
				func.setSalario(Double.parseDouble(sal));
			}

			func.setDepartamento(departamento.getText());

			String num = numero.getText();
			int numInt = 0;
			if (num != null && !num.isEmpty()) {
				numInt = Integer.parseInt(numero.getText());
			}

			Endereco end = new Endereco(rua.getText(), numInt);
			func.Endereco = end;

			if (result == JOptionPane.YES_OPTION) {
				System.out.println(func);
				funcionarios.add(func);
			} else if (result == JOptionPane.CANCEL_OPTION) {
				listarCadastros();
			}
		}
	}

	private void listarCadastros() {

		String content = "";
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);

		if (funcionarios.size() == 0) {
			content = ("\nNão existem cadastros!!!\n");
		} else {
			for (int i = 0; i < funcionarios.size(); i++) {
				Funcionario func = funcionarios.get(i);
				content = content + ("\n" + "CPF: " + func.getCpf() + "\n" + "Matricula: " + func.getMatricula() + "\n"
						+ "Nome: " + func.getNome() + "\n" + "Cargo: " + func.getCargo() + "\n" + "Salario (+30%): R$"
						+ df.format(aumentaSalario(func.getSalario(), 30)) + "\n" + "Departamento: "
						+ func.getDepartamento() + "\n" + "Rua: " + func.Endereco.getRua() + "\n" + "Numero: "
						+ func.Endereco.getNumero() + "\n" + "======================================");

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content, "Lista funcionarios cadastrados",
				JOptionPane.OK_OPTION);

		if (result == JOptionPane.OK_OPTION) {
			System.exit(0);
		}

	}

	public double aumentaSalario(double salario, int percent) {
		double newSalario;
		newSalario = salario + (salario * percent / 100);
		return newSalario;
	}

}
