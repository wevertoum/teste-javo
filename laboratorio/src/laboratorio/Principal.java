package laboratorio;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Conta conta = new Conta();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int number;
		do {
			System.out.println("digite um valor para depósito");
			while (!sc.hasNextInt()) {
				System.out.println("Valor inválido! Tente novamente...");
				sc.next(); // this is important!
			}
			number = sc.nextInt();
		} while (number <= 0);
		System.out.println("Valeu, depositei R$" + number + " reais");
		conta.deposita(number);
		if (conta.getSaldo() > 10) {
			System.out.println("Vc depositou mais de 10 reais :D");
		} else {
			System.out.println("Vc depositou menos de 10 reais :(");
		}
	}
}
