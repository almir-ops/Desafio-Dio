package packpage;

public class ContaPoupança extends Conta {
	
	public ContaPoupança(Cliente cliente) {
		super(cliente);
	}
	public void Extrato() {
		System.out.println("======= Extrato Conta Corrente =======");
		super.ImprimirDados();
	}
	
}
