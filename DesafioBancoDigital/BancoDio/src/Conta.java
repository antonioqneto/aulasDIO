
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta (Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		System.out.println("---------------------------");
		System.out.println("--- SAQUE REALIZADO ---");
		System.out.println(String.format("VALOR = R$ %.2f", valor));
		System.out.println(String.format("CONTA: %d", this.numero));
		System.out.println("---------------------------");	
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("---------------------------");
		System.out.println("--- DEP?SITO REALIZADO ---");
		System.out.println(String.format("VALOR = R$ %.2f", valor));
		System.out.println(String.format("CONTA: %d", this.numero));
		System.out.println("---------------------------");
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		System.out.println("---------------------------");
		System.out.println("--- TRANSFER?NCIA REALIZADA ---");
		System.out.println(String.format("VALOR = R$ %.2f", valor));
		System.out.println(String.format("CONTA DE ORIGEM: %d", this.numero));
		System.out.println(String.format("CONTA DE DESTINO: %d", contaDestino.numero));
		System.out.println("---------------------------");
		
		
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Endereco: %s", this.cliente.getEndereco()));
		System.out.println(String.format("Ag?ncia: %d",agencia));
		System.out.println(String.format("N?mero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
	
}
