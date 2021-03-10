package laboratorio;

import java.util.List;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javax.swing.*;

public class CadastraProdutos {

	private List<Dados> dados;

	public static void main(String[] args) {
		CadastraProdutos cadastro = new CadastraProdutos();
		cadastro.showStartMenu();
	}

	public void showStartMenu() {

		dados = new ArrayList<Dados>();

		JFrame StartMenu = new JFrame();
		ImageIcon iconBye = new ImageIcon(new ImageIcon("bye.png").getImage().getScaledInstance(70, 70, 0));
		JButton Cadastrar = new JButton("Cadastrar");
		JButton ListarCadastros = new JButton("Listar cadastros");
		JButton Sair = new JButton("Sair");

		StartMenu.getContentPane().add(Cadastrar);
		StartMenu.getContentPane().add(ListarCadastros);
		StartMenu.getContentPane().add(Sair);

		Cadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});

		ListarCadastros.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {

				listarCadastros();
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
		StartMenu.setSize(510, 600);
		StartMenu.add(new JLabel(new ImageIcon("box.png")));
		StartMenu.setLayout(null);

		Cadastrar.setBounds(100, 25, 295, 88);
		ListarCadastros.setBounds(100, 150, 295, 88); // set size of buttons
		Sair.setBounds(100, 275, 295, 88);

	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			Dados d = new Dados();

			JTextField nome = new JTextField();
			JTextField quantidade = new JTextField();
			JTextField tipo = new JTextField();
			JTextField valor = new JTextField();

			Object[] fields = { "Informe o nome", nome, "Informe a quantidade", quantidade, "Informe o tipo", tipo,
					"Informe o valor", valor };

			int result = JOptionPane.showConfirmDialog(null, fields, "Cancelar: voltar, OK: salvar",
					JOptionPane.OK_CANCEL_OPTION);

			d.setNome(nome.getText());
			d.setQuantidade(quantidade.getText());
			d.setTipo(tipo.getText());
			d.setValor(valor.getText());

			if (result == JOptionPane.YES_OPTION) {
				dados.add(d);
			} else if (result == JOptionPane.CANCEL_OPTION) {
				return;
			}
		}
	}

	private void listarCadastros() {

		String content = "";

		if (dados.size() == 0) {
			content = ("\nNão existem cadastros!!!\n");
		} else {
			for (int i = 0; i < dados.size(); i++) {
				Dados d = dados.get(i);
				content = content + (" Cadastro número: " + i + "\tNome: " + d.getNome() + "\n" + "\tQuantidade: "
						+ d.getQuantidade() + "\n" + "\tTipo: " + d.getTipo() + "\n" + "\tValor: " + d.getValor()
						+ "\n");

			}
		}

		int result = JOptionPane.showConfirmDialog(null, content, "Lista itens cadastrados", JOptionPane.OK_OPTION);

		if (result == JOptionPane.OK_OPTION) {
			return;
		}

	}

}
