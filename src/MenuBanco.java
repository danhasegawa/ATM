import java.util.Scanner;

public class MenuBanco extends Conta {

	
	
	Scanner digite = new Scanner(System.in);

	public void iniciar() {
		int opcao;
		

		do {
			exibeMenu();
			opcao = digite.nextInt();
			escolheOpcao(opcao);
		} while (opcao != 6);
	}

	public void exibeMenu() {

		System.out.println("** BEM VINDO AO BEDFORD FIRST BANK **");
		System.out.println("");
		System.out.println("|------------ MENU ------------|");
		System.out.println("| 1- CRIAR CONTA               |");
		System.out.println("| 2- CONSULTAR SALDO           |");
		System.out.println("| 3- SAQUE                     |");
		System.out.println("| 4- DEPOSITO                  |");
		System.out.println("| 5- SAIR                      |");
		System.out.println("|------------------------------|");
		System.out.println("");
		System.out.print("Selecione a operacao desejada: ");
		System.out.println();
	}

	public void escolheOpcao(int opcao) {
		
		

		
		switch (opcao) {
		case 1:
			menuCriarConta();
			break;
		case 2:
			System.out.println("Seu salo atual eh de R$" + super.getSaldo());
			System.out.println();
			break;
		case 3:
			System.out.println("Valor a ser sacado: ");
			super.sacar(valor);

			break;
		case 4:
			System.out.println("Valor a ser depositado: ");
			System.out.println();
			super.depositar(valor);
			break;
		
		case 5:
			System.out.println("Sistema Encerrado");
			break;
		default:
			System.out.println("Opcao invalida");

		}
	}
	
	public  void menuCriarConta() {
		int op;

		System.out.println("\n");
		System.out.println("********* CRIAR CONTA *********");
		System.out.println("");
		System.out.println("|------------ MENU ------------|");
		System.out.println("| 1- CONTA CORRENTE            |");
		System.out.println("| 2- CONTA POUPANCA		       |");
		System.out.println("| 3- VOLTAR AO MENU            |");
		System.out.println("|------------------------------|");
		System.out.println("");
		System.out.println("Selecione a operacao desejada: ");
		op = digite.nextInt();

			
		switch (op) {
		case 1:
			ContaCorrente cc = new ContaCorrente();
			System.out.println(" Conta Corrente criada");
			break;
		case 2:
			ContaPoupanca cp = new  ContaPoupanca();
			System.out.println("Criar Conta Poupanca");
			break;
		case 3:
			return;
		default:
			System.out.println("comando invalid");
		digite.close();
			

		}
		
	}
	public static void main(String[] args) {
		
		
		MenuBanco menu = new MenuBanco();
		menu.iniciar();

}

	
}