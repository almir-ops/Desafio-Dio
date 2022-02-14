package packpage;

public class Main {

	

	public static void main(String[] args) {
		
		Cliente titular = new Cliente();
		titular.setNome("Almir");
		
		Conta cc = new ContaCorrente(titular);
		Conta poupanca = new ContaPoupança(titular);
		cc.depositar(500);
		
		cc.caixaEletronico();
	}

}
