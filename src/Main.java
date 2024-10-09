import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Organizar main
		
		Cliente carlos = new Cliente();
		Cliente junior = new Cliente();
		Cliente poupanca2 = new Cliente();
		
		carlos.setNome("Carlos");
		junior.setNome("Junior");
		poupanca2.setNome("Maria");
		
		Conta cc = new ContaCorrente(carlos);
		IConta cc1 = new ContaCorrente(junior);
		Conta poupanca1 = new ContaPoupanca(junior);
		ContaPoupanca poupanca = new ContaPoupanca(poupanca2);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		cc.depositar(150);
		cc.sacar(76.41);
		poupanca.sacar(2);
		poupanca.imprimirExtrato(); //Estou sacando de uma conta que não tem dinheiro?

		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
	}

}
