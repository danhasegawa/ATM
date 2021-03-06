import java.util.Scanner;

public abstract class Conta {

	protected String titular;
	protected String cpf;
	protected double saldo;
	protected double valor;

	Scanner digite = new Scanner(System.in);

	public void depositar(double valor) {
		valor = digite.nextDouble();
		this.saldo += valor;

	}

	public void sacar(double valor) {
		valor = digite.nextDouble();
		if (saldo > 0 && valor > 0) {
			this.saldo -= valor;
		} else {
			System.out.println("Valor do saldo insuficiente.");
		}
	}

	

	public double getSaldo() {
		return this.saldo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
