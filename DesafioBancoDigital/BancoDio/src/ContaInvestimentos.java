
public class ContaInvestimentos extends Conta{

	public ContaInvestimentos(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Investimentos ===");
		super.imprimirInfosComuns();
	}
}
