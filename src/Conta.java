
public abstract class Conta implements IConta{
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;


	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void menu() {
		String menu = "Menu de opções bancárias!"
				+ "\n1 - sacar"
				+ "\n2 - deposito"
				+ "\n3 - trasnferencia"
				+ "\n4 - extrato";
		
		System.out.println(menu);
	}
	
	public void sacar(double valor) {
		boolean excedeu_saldo = valor > saldo;
		if (excedeu_saldo) {
			throw new RuntimeException("Não foi possível realizar esta operação!");
		} else if (valor > 0) {
			this.saldo -= valor;			
		}

	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;			
		} else {
			throw new RuntimeException("Não foi possível realizar esta operação!");
		}

	}

	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {		
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f%n", this.saldo));
		System.out.println("================\n");

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
}
