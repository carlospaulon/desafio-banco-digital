import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente carlos = new Cliente();
		Conta banco = new ContaCorrente(carlos);
		boolean laco = true;
		
		
		while (laco) {
			banco.menu();
			int opcao = sc.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Insira o valor que deseja sacar:");
					double valorSaque = sc.nextDouble();
					banco.sacar(valorSaque);
					break;
				case 2:
					System.out.println("Insira um valor para depósito:");
					double valorDeposito = sc.nextDouble();
					banco.depositar(valorDeposito);
					break;
				case 3:
					System.out.println("Insira um valor para transferência");
					double valorTransferencia = sc.nextDouble();
					
					banco.transferir(valorTransferencia, banco);
					break;
				case 4:
					banco.imprimirExtrato();
					break;
				case 5:
					System.out.println("Obrigado pela preferência!");
					laco = false;
					break;
				
			}
			
		}
	}

}

//		//Organizar main
//		
//		Cliente carlos = new Cliente();e
//		Cliente junior = new Cliente();
//		Cliente poupanca2 = new Cliente();
//		
//		carlos.setNome("Carlos");
//		junior.setNome("Junior");
//		poupanca2.setNome("Giovana");
//		
//		Conta cc = new ContaCorrente(carlos);
//		IConta cc1 = new ContaCorrente(junior);
//		Conta poupanca1 = new ContaPoupanca(junior);
//		ContaPoupanca poupanca = new ContaPoupanca(poupanca2);
//		
//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();
//		poupanca1.imprimirExtrato();
//		
//		cc.depositar(150);
//		cc.sacar(76.41);
////		poupanca.sacar(2);
//		poupanca.imprimirExtrato(); //Estou sacando de uma conta que não tem dinheiro?
//
//		
//		cc.transferir(50, poupanca);
//		
//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();