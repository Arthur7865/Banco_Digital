public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança:");
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
