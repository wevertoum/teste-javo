package semana1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CadastraProdutos {

	private List<Dados> dados;

	public static void main(String[] args) {
		CadastraProdutos cadastro = new CadastraProdutos();
		cadastro.showStartMenu();
	}

	public void showStartMenu() {

		dados = new ArrayList<>();

		JFrame StartMenu = new JFrame();
		ImageIcon iconBye = new ImageIcon(new ImageIcon("bye.png").getImage().getScaledInstance(70, 70, 0));
		JButton Cadastrar = new JButton("Cadastrar");
		JButton ListarCadastros = new JButton("Listar cadastros");
		JButton Sair = new JButton("Sair");

		StartMenu.getContentPane().add(Cadastrar);
		StartMenu.getContentPane().add(ListarCadastros);
		StartMenu.getContentPane().add(Sair);

		Cadastrar.addActionListener(e -> cadastrar());

		ListarCadastros.addActionListener(e -> listarCadastros());
		Sair.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "vc quis: " + e.getActionCommand(), "Foi um prazer!",
					JOptionPane.INFORMATION_MESSAGE, iconBye);
			System.exit(0);
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

		while (true) {
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

		StringBuilder content = new StringBuilder();

		if (dados.size() == 0) {
			content = new StringBuilder(("\nNão existem cadastros!!!\n"));
		} else {
			for (int i = 0; i < dados.size(); i++) {
				Dados d = dados.get(i);
				content.append(" Cadastro número: ").append(i).append("\tNome: ").append(d.getNome()).append("\n").append("\tQuantidade: ").append(d.getQuantidade()).append("\n").append("\tTipo: ").append(d.getTipo()).append("\n").append("\tValor: ").append(d.getValor()).append("\n");

			}
		}

		JOptionPane.showConfirmDialog(null, content.toString(), "Lista itens cadastrados", JOptionPane.YES_NO_OPTION);

	}

}
