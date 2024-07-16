import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

	public void imprimirClientesEContas() {
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Conta: " + "Agencia: " + conta.getAgencia() + ", Numero: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
            System.out.println("-------------------------------------------------");
        }
    }
}
