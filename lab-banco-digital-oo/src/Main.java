
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel Titato");
		
		Cliente murilo = new Cliente();
		murilo.setNome("Murilo Silva");
		
		Cliente luis = new Cliente();
		luis.setNome("Luis Souza");
		
		Conta cccontaGabriel = new ContaCorrente(gabriel);
		Conta contaMurilo = new ContaPoupanca(murilo);
		Conta contaLuis = new ContaPoupanca(luis);

		cccontaGabriel.depositar(100);
		cccontaGabriel.transferir(100, contaMurilo);
		contaMurilo.transferir(50, contaLuis);
		
		banco.adicionarConta(cccontaGabriel);
        banco.adicionarConta(contaMurilo);
        banco.adicionarConta(contaLuis);
		
		cccontaGabriel.imprimirExtrato();
		contaMurilo.imprimirExtrato();
		contaLuis.imprimirExtrato();
		
		System.out.println("\nTodas as contas registradas:");
        banco.imprimirClientesEContas();
	}


}
