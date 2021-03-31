package semana3;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

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
		musicas = new ArrayList<Musica>();
		alunos = new ArrayList<Aluno>();
		clientes = new ArrayList<Cliente>();
		empregados = new ArrayList<Empregado>();

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

		InstanciaMusica.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instanciarMusicas();
			}
		});

		InstanciaAlunos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instanciarAlunos();
			}
		});

		InstanciaClientes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instanciarClientes();
			}
		});

		InstanciaEmpregado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instanciarEmpregados();
			}
		});

		Sair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "vc quis: " + e.getActionCommand(), "Foi um prazer!",
						JOptionPane.INFORMATION_MESSAGE, iconBye);
				System.exit(0);
			}
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
		boolean cadastrando = true;

		while (cadastrando) {
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

			Compositor comp = new Compositor(nomeComposi.getText(), naciComposi.getText());
			mus.compositor = comp;

			if (result == JOptionPane.YES_OPTION) {
				musicas.add(mus);
			} else if (result == JOptionPane.CANCEL_OPTION) {
				listarMusicas();
			}
		}
	}

	private void listarMusicas() {

		String content = "";

		if (musicas.size() == 0) {
			content = ("\nNão existem musicas cadastradas!!!\n");
		} else {
			for (int i = 0; i < musicas.size(); i++) {
				Musica mus = musicas.get(i);
				content = content + ("\n\nMusica numero: " + (i + 1) + "\n" + "Nome: " + mus.getNome() + "\n" + "Ano: "
						+ mus.getAno() + "\n" + "Tipo: " + mus.getTipo() + "\n" + "Nome compositor: "
						+ mus.compositor.getNome() + "\n" + "Nac. do compositor: " + mus.compositor.getNacionalidade());

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content, "Lista musicas cadastradas", JOptionPane.OK_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			if (musicas.size() == 0) {
				return;
			} else {
				System.exit(0);
			}
		}

	}

//	--------------------------------
// ALUNOS
//	--------------------------------

	private void instanciarAlunos() {
		boolean cadastrando = true;

		while (cadastrando) {
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
			Curso curso = new Curso(cursoNome.getText(), cursoSigla.getText(), depto);
			aluno.curso = curso;

			if (result == JOptionPane.YES_OPTION) {
				alunos.add(aluno);
			} else if (result == JOptionPane.CANCEL_OPTION) {
				listarAlunos();
			}
		}
	}

	private void listarAlunos() {

		String content = "";

		if (alunos.size() == 0) {
			content = ("\nNão existem alunos cadastradas!!!\n");
		} else {
			for (int i = 0; i < alunos.size(); i++) {
				Aluno aluno = alunos.get(i);
				content = content + ("\n\nAluno numero: " + (i + 1) + "\n" + "Nome: " + aluno.getNome() + "\n"
						+ "Matricula: " + aluno.getMatricula() + "\n" + "Ano: " + aluno.getAno() + "\n" + "Nome curso: "
						+ aluno.curso.getNome() + "\n" + "Sigla curso: " + aluno.curso.getSigla() + "\n" + "Nome dpto: "
						+ aluno.curso.departamento.getNome() + "\n" + "Sigla dpto"
						+ aluno.curso.departamento.getSigla());

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content, "Lista alunos cadastrados", JOptionPane.OK_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			if (alunos.size() == 0) {
				return;
			} else {
				System.exit(0);
			}
		}

	}

//	--------------------------------
// CLIENTES
//	--------------------------------

	private void instanciarClientes() {
		boolean cadastrando = true;

		while (cadastrando) {
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

		String content = "";

		if (clientes.size() == 0) {
			content = ("\nNão existem clientes cadastradas!!!\n");
		} else {
			for (int i = 0; i < clientes.size(); i++) {
				Cliente cliente = clientes.get(i);
				content = content + ("\n\nCliente numero: " + (i + 1) + "\n" + "Nome: " + cliente.getNome() + "\n"
						+ "CPF: " + cliente.getCpf() + "\n" + "Rua: " + cliente.endereco.getRua() + "\n" + "Numero: "
						+ cliente.endereco.getNumero() + "\n" + "Bairro: " + cliente.endereco.getBairro() + "\n"
						+ "Complemento: " + cliente.endereco.getComplemento() + "\n" + "Cidade: "
						+ cliente.endereco.getCidade() + "\n" + "Estado: " + cliente.endereco.getEstado());

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content, "Lista clientes cadastrados", JOptionPane.OK_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			if (clientes.size() == 0) {
				return;
			} else {
				System.exit(0);
			}
		}

	}

//	--------------------------------
// EMPREGADOS
//	--------------------------------

	private void instanciarEmpregados() {
		boolean cadastrando = true;

		while (cadastrando) {
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

		String content = "";

		if (empregados.size() == 0) {
			content = ("\nNão existem empregados cadastradas!!!\n");
		} else {
			for (int i = 0; i < empregados.size(); i++) {
				Empregado empregado = empregados.get(i);
				content = content + ("\n\nEmpregado numero: " + (i + 1) + "\n" + "Nome: " + empregado.getNome() + "\n"
						+ "Matricula: " + empregado.getMatricula() + "\n" + "Razao empresa: "
						+ empregado.empresa.getRazao() + "\n" + "CNPJ: " + empregado.empresa.getCnpj() + "\n"
						+ "Rua empresa: " + empregado.empresa.endereco.getRua() + "\n" + "Numero empresa: "
						+ empregado.empresa.endereco.getNumero() + "\n" + "Bairro empresa: "
						+ empregado.empresa.endereco.getBairro() + "\n" + "Complemento empresa: "
						+ empregado.empresa.endereco.getComplemento() + "\n" + "Cidade empresa: "
						+ empregado.empresa.endereco.getCidade() + "\n" + "Estado empresa: "
						+ empregado.empresa.endereco.getEstado());

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content, "Lista empregados cadastrados",
				JOptionPane.OK_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			if (empregados.size() == 0) {
				return;
			} else {
				System.exit(0);
			}
		}

	}

}
