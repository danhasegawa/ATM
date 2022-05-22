import java.util.Scanner;

public abstract class Conta {

	protected String titular;
	protected String cpf;
	protected double saldo;
	protected double valor;

	Scanner digite = new Scanner(System.in);

	public double depositoInicial(double valor) {
		if (valor < 50) {
			System.out.println("Erro, valor inicial minimo R$50.0");
			return valor;

		} else {
			return saldo = saldo + valor;
		}

	}

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

	public void transfere(double valor, Conta destino) {
		System.out.println("Valor da Transferência: ");
		valor = digite.nextDouble();
		
		if (saldo > valor) {
			this.sacar(valor);
			destino.depositar(valor);
			System.out.println("Transferindo valor... " + valor);
			System.out.println("Saldo: " + getSaldo());
		} else {
			System.out.println("Erro");
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