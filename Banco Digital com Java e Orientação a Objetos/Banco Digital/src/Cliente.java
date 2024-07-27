import java.util.List;
import java.util.ArrayList;


public class Cliente {
    private String nome;
    private List<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
}
