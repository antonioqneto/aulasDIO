
public class Main {

	public static void main(String[] args) {
		Cliente fulano = new Cliente();
		Cliente beltrano = new Cliente();
		fulano.setNome("Fulano");
		fulano.setEndereco("Rua dos bobos, 0");
		beltrano.setNome("Beltrano");
		beltrano.setEndereco("Rua Ramalhete");
		
		Conta cc = new ContaCorrente(fulano);
		Conta poupanca = new ContaPoupanca(fulano);
		Conta investimentos = new ContaInvestimentos(beltrano);
		
		
		cc.depositar(500);
		cc.transferir(250, poupanca);
		poupanca.transferir(100, investimentos);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		investimentos.imprimirExtrato();
		
	}
}
