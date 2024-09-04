import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Banco banco = new Banco("Banco Digital");
        List<Conta> contas = banco.getContas();


        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        contas.add(cc);
        contas.add(poupanca);
        banco.setContas(contas);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.listarContas();
    }

}
