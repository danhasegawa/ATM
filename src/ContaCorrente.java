import java.util.Scanner;
public class ContaCorrente extends Conta {
	
	Scanner digite = new Scanner(System.in);


	@Override
	public  void depositar(double valor) {
		valor = digite.nextDouble();
		super.saldo += valor;
		
	}

}
