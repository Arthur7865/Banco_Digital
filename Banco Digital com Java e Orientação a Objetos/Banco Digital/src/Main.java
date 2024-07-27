public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");

        Conta contaCorrente = new ContaCorrente("12345", 1000.0, 500.0);
        Conta contaPoupanca = new ContaPoupanca("67890", 2000.0);

        cliente.adicionarConta(contaCorrente);
        cliente.adicionarConta(contaPoupanca);

        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaCorrente.transferir(contaPoupanca, 300);

        cliente.listarContas();
    }
}
