package laboratorio;

public class Conta {
	private double saldo;

	void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
