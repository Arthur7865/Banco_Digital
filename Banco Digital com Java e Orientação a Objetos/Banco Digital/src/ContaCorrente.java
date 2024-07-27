public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double saldoInicial, double limite) {
        super(numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() + limite >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo e limite insuficientes!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente:");
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
