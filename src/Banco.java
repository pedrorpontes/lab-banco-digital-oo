import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

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
	public void listarContas(){
		int contador = 1;
		System.out.println("Listando todas as contas deste banco:");
		for(Conta conta : contas){
			System.out.println(contador + " - Titular: " + conta.getCliente().getNome() + ". Número da Conta: " + conta.getNumero() + ". Número da Agência: " + conta.getAgencia());
			contador++;
		}
	}

}
