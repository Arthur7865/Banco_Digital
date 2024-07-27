public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    public abstract void imprimirExtrato();
}
