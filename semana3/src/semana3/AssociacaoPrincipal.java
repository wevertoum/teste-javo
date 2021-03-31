package semana3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AssociacaoPrincipal {
	private List<Musica> musicas;
	private List<Aluno> alunos;
	private List<Cliente> clientes;
	private List<Empregado> empregados;

	public static void main(String[] args) {
		AssociacaoPrincipal associacao = new AssociacaoPrincipal();
		associacao.showStartMenu();
	}

	public void showStartMenu() {
		musicas = new ArrayList<>();
		alunos = new ArrayList<>();
		clientes = new ArrayList<>();
		empregados = new ArrayList<>();

		JFrame StartMenu = new JFrame();
		ImageIcon iconBye = new ImageIcon(new ImageIcon("bye.png").getImage().getScaledInstance(70, 70, 0));
		JButton InstanciaMusica = new JButton("Instancia de Musica");
		JButton InstanciaAlunos = new JButton("Instancia de Alunos");
		JButton InstanciaClientes = new JButton("Instancia de Clientes");
		JButton InstanciaEmpregado = new JButton("Instancia de Empregado");
		JButton Sair = new JButton("Sair");

		StartMenu.getContentPane().add(InstanciaMusica);
		StartMenu.getContentPane().add(InstanciaAlunos);
		StartMenu.getContentPane().add(InstanciaClientes);
		StartMenu.getContentPane().add(InstanciaEmpregado);
		StartMenu.getContentPane().add(Sair);

		InstanciaMusica.addActionListener(e -> instanciarMusicas());

		InstanciaAlunos.addActionListener(e -> instanciarAlunos());

		InstanciaClientes.addActionListener(e -> instanciarClientes());

		InstanciaEmpregado.addActionListener(e -> instanciarEmpregados());

		Sair.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "vc quis: " + e.getActionCommand(), "Foi um prazer!",
					JOptionPane.INFORMATION_MESSAGE, iconBye);
			System.exit(0);
		});

		StartMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StartMenu.setVisible(true);
		StartMenu.setSize(510, 700);
		StartMenu.add(new JLabel(new ImageIcon("box.png")));
		StartMenu.setLayout(null);

		InstanciaMusica.setBounds(100, 25, 295, 88);
		InstanciaAlunos.setBounds(100, 150, 295, 88);
		InstanciaClientes.setBounds(100, 275, 295, 88);
		InstanciaEmpregado.setBounds(100, 400, 295, 88);
		Sair.setBounds(100, 525, 295, 88);

	}

//	--------------------------------
// MUSICAS
//	--------------------------------

	private void instanciarMusicas() {

		while (true) {
			Musica mus = new Musica();

			JTextField nome = new JTextField();
			JTextField ano = new JTextField();
			JTextField tipo = new JTextField();
			JTextField nomeComposi = new JTextField();
			JTextField naciComposi = new JTextField();

			Object[] fields = { "Informe o nome", nome, "Informe o ano", ano, "Informe o tipo", tipo,
					"Nome do compositor", nomeComposi, "Nacionalidade do compositor", naciComposi };

			int result = JOptionPane.showConfirmDialog(null, fields, "Cancel: listar, OK: cadastrar",
					JOptionPane.OK_CANCEL_OPTION);

			String anoInteger = ano.getText();

			mus.setNome(nome.getText());
			if (anoInteger != null && !anoInteger.isEmpty()) {
				mus.setAno(Integer.parseInt(anoInteger));
			}
			mus.setTipo(tipo.getText());

			mus.compositor = new Compositor(nomeComposi.getText(), naciComposi.getText());

			if (result == JOptionPane.YES_OPTION) {
				musicas.add(mus);
			} else if (result == JOptionPane.CANCEL_OPTION) {
				listarMusicas();
			}
		}
	}

	private void listarMusicas() {

		StringBuilder content = new StringBuilder();

		if (musicas.size() == 0) {
			content = new StringBuilder(("\nNão existem musicas cadastradas!!!\n"));
		} else {
			for (int i = 0; i < musicas.size(); i++) {
				Musica mus = musicas.get(i);
				content.append("\n\nMusica numero: ").append(i + 1).append("\n").append("Nome: ").append(mus.getNome()).append("\n").append("Ano: ").append(mus.getAno()).append("\n").append("Tipo: ").append(mus.getTipo()).append("\n").append("Nome compositor: ").append(mus.compositor.getNome()).append("\n").append("Nac. do compositor: ").append(mus.compositor.getNacionalidade());

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content.toString(), "Lista musicas cadastradas", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			if (musicas.size() == 0) {
			} else {
				System.exit(0);
			}
		}

	}

//	--------------------------------
// ALUNOS
//	--------------------------------

	private void instanciarAlunos() {

		while (true) {
			Aluno aluno = new Aluno();

			JTextField nome = new JTextField();
			JTextField matricula = new JTextField();
			JTextField ano = new JTextField();
			JTextField cursoNome = new JTextField();
			JTextField cursoSigla = new JTextField();
			JTextField dptoNome = new JTextField();
			JTextField dptoSigla = new JTextField();

			Object[] fields = { "Informe o nome", nome, "Informe a matricula", matricula, "Informe o ano", ano,
					"Nome do curso", cursoNome, "Sigla do curso", cursoSigla, "Dept nome", dptoNome, "Dept sigla",
					dptoSigla };

			int result = JOptionPane.showConfirmDialog(null, fields, "Cancel: listar, OK: cadastrar",
					JOptionPane.OK_CANCEL_OPTION);

			String matriculaInteger = ano.getText();
			String anoInteger = ano.getText();

			aluno.setNome(nome.getText());
			if (matriculaInteger != null && !matriculaInteger.isEmpty()) {
				aluno.setMatricula(Integer.parseInt(matriculaInteger));
			}
			if (anoInteger != null && !anoInteger.isEmpty()) {
				aluno.setAno(Integer.parseInt(anoInteger));
			}
			Departamento depto = new Departamento(dptoNome.getText(), dptoSigla.getText());
			aluno.curso = new Curso(cursoNome.getText(), cursoSigla.getText(), depto);

			if (result == JOptionPane.YES_OPTION) {
				alunos.add(aluno);
			} else if (result == JOptionPane.CANCEL_OPTION) {
				listarAlunos();
			}
		}
	}

	private void listarAlunos() {

		StringBuilder content = new StringBuilder();

		if (alunos.size() == 0) {
			content = new StringBuilder(("\nNão existem alunos cadastradas!!!\n"));
		} else {
			for (int i = 0; i < alunos.size(); i++) {
				Aluno aluno = alunos.get(i);
				content.append("\n\nAluno numero: ").append(i + 1).append("\n").append("Nome: ").append(aluno.getNome()).append("\n").append("Matricula: ").append(aluno.getMatricula()).append("\n").append("Ano: ").append(aluno.getAno()).append("\n").append("Nome curso: ").append(aluno.curso.getNome()).append("\n").append("Sigla curso: ").append(aluno.curso.getSigla()).append("\n").append("Nome dpto: ").append(aluno.curso.departamento.getNome()).append("\n").append("Sigla dpto").append(aluno.curso.departamento.getSigla());

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content.toString(), "Lista alunos cadastrados", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			if (alunos.size() == 0) {
			} else {
				System.exit(0);
			}
		}

	}

//	--------------------------------
// CLIENTES
//	--------------------------------

	private void instanciarClientes() {

		while (true) {
			Cliente cliente = new Cliente();
			Endereco endereco = new Endereco();

			JTextField nome = new JTextField();
			JTextField cpf = new JTextField();

			JTextField rua = new JTextField();
			JTextField numero = new JTextField();
			JTextField bairro = new JTextField();
			JTextField complemento = new JTextField();
			JTextField cidade = new JTextField();
			JTextField estado = new JTextField();

			Object[] fields = { "Informe o nome", nome, "Informe o cpf", cpf, "Informe a rua", rua, "Informe o numero",
					numero, "Informe o bairro", bairro, "Informe o complemento", complemento, "Informe a cidade",
					cidade, "Informe o estado", estado };

			int result = JOptionPane.showConfirmDialog(null, fields, "Cancel: listar, OK: cadastrar",
					JOptionPane.OK_CANCEL_OPTION);

			String numeroInteger = numero.getText();

			cliente.setNome(nome.getText());
			cliente.setCpf(cpf.getText());

			endereco.setRua(rua.getText());
			if (numeroInteger != null && !numeroInteger.isEmpty()) {
				endereco.setNumero(Integer.parseInt(numeroInteger));
			}
			endereco.setBairro(bairro.getText());
			endereco.setComplemento(complemento.getText());
			endereco.setCidade(cidade.getText());
			endereco.setEstado(estado.getText());

			cliente.endereco = endereco;

			if (result == JOptionPane.YES_OPTION) {
				clientes.add(cliente);
			} else if (result == JOptionPane.CANCEL_OPTION) {
				listarClientes();
			}
		}
	}

	private void listarClientes() {

		StringBuilder content = new StringBuilder();

		if (clientes.size() == 0) {
			content = new StringBuilder(("\nNão existem clientes cadastradas!!!\n"));
		} else {
			for (int i = 0; i < clientes.size(); i++) {
				Cliente cliente = clientes.get(i);
				content.append("\n\nCliente numero: ").append(i + 1).append("\n").append("Nome: ").append(cliente.getNome()).append("\n").append("CPF: ").append(cliente.getCpf()).append("\n").append("Rua: ").append(cliente.endereco.getRua()).append("\n").append("Numero: ").append(cliente.endereco.getNumero()).append("\n").append("Bairro: ").append(cliente.endereco.getBairro()).append("\n").append("Complemento: ").append(cliente.endereco.getComplemento()).append("\n").append("Cidade: ").append(cliente.endereco.getCidade()).append("\n").append("Estado: ").append(cliente.endereco.getEstado());

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content.toString(), "Lista clientes cadastrados", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			if (clientes.size() == 0) {
			} else {
				System.exit(0);
			}
		}

	}

//	--------------------------------
// EMPREGADOS
//	--------------------------------

	private void instanciarEmpregados() {

		while (true) {
			Endereco endereco = new Endereco();
			Empresa empresa = new Empresa();
			Empregado empregado = new Empregado();

			JTextField nome = new JTextField();
			JTextField matricula = new JTextField();

			JTextField razao = new JTextField();
			JTextField cnpj = new JTextField();

			JTextField rua = new JTextField();
			JTextField numero = new JTextField();
			JTextField bairro = new JTextField();
			JTextField complemento = new JTextField();
			JTextField cidade = new JTextField();
			JTextField estado = new JTextField();

			Object[] fields = { "Informe o nome", nome, "Informe a matricula", matricula, "Informe a razao empresa",
					razao, "Informe o cnpj", cnpj, "Informe a rua", rua, "Informe o numero", numero, "Informe o bairro",
					bairro, "Informe o complemento", complemento, "Informe a cidade", cidade, "Informe o estado",
					estado };

			int result = JOptionPane.showConfirmDialog(null, fields, "Cancel: listar, OK: cadastrar",
					JOptionPane.OK_CANCEL_OPTION);

			String numeroInteger = numero.getText();

			empregado.setNome(nome.getText());
			empregado.setMatricula(matricula.getText());

			empresa.setRazao(razao.getText());
			empresa.setCnpj(cnpj.getText());

			endereco.setRua(rua.getText());
			if (numeroInteger != null && !numeroInteger.isEmpty()) {
				endereco.setNumero(Integer.parseInt(numeroInteger));
			}
			endereco.setBairro(bairro.getText());
			endereco.setComplemento(complemento.getText());
			endereco.setCidade(cidade.getText());
			endereco.setEstado(estado.getText());

			empresa.endereco = endereco;
			empregado.empresa = empresa;

			if (result == JOptionPane.YES_OPTION) {
				empregados.add(empregado);
			} else if (result == JOptionPane.CANCEL_OPTION) {
				listarEmpregados();
			}
		}
	}

	private void listarEmpregados() {

		StringBuilder content = new StringBuilder();

		if (empregados.size() == 0) {
			content = new StringBuilder(("\nNão existem empregados cadastradas!!!\n"));
		} else {
			for (int i = 0; i < empregados.size(); i++) {
				Empregado empregado = empregados.get(i);
				content.append("\n\nEmpregado numero: ").append(i + 1).append("\n").append("Nome: ").append(empregado.getNome()).append("\n").append("Matricula: ").append(empregado.getMatricula()).append("\n").append("Razao empresa: ").append(empregado.empresa.getRazao()).append("\n").append("CNPJ: ").append(empregado.empresa.getCnpj()).append("\n").append("Rua empresa: ").append(empregado.empresa.endereco.getRua()).append("\n").append("Numero empresa: ").append(empregado.empresa.endereco.getNumero()).append("\n").append("Bairro empresa: ").append(empregado.empresa.endereco.getBairro()).append("\n").append("Complemento empresa: ").append(empregado.empresa.endereco.getComplemento()).append("\n").append("Cidade empresa: ").append(empregado.empresa.endereco.getCidade()).append("\n").append("Estado empresa: ").append(empregado.empresa.endereco.getEstado());

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content.toString(), "Lista empregados cadastrados",
				JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			if (empregados.size() == 0) {
			} else {
				System.exit(0);
			}
		}

	}

}
