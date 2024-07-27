### Descrição do Código

#### Classe `Conta`

- **Descrição**: Representa uma conta bancária genérica.
- **Atributos**:
  - `numero`: Número da conta.
  - `saldo`: Saldo da conta.
- **Métodos**:
  - `depositar(double valor)`: Adiciona um valor ao saldo.
  - `sacar(double valor)`: Subtrai um valor do saldo, se houver saldo suficiente.
  - `transferir(Conta destino, double valor)`: Transfere um valor para outra conta, se houver saldo suficiente.
  - `imprimirExtrato()`: Método abstrato para impressão de extrato.

#### Classe `ContaCorrente`

- **Descrição**: Representa uma conta corrente, herdando de `Conta`.
- **Atributos**:
  - `limite`: Limite de crédito adicional.
- **Métodos**:
  - `sacar(double valor)`: Permite saque até o limite de crédito.
  - `imprimirExtrato()`: Imprime o extrato da conta corrente.

#### Classe `ContaPoupanca`

- **Descrição**: Representa uma conta poupança, herdando de `Conta`.
- **Métodos**:
  - `imprimirExtrato()`: Imprime o extrato da conta poupança.

#### Classe `Cliente`

- **Descrição**: Representa um cliente bancário.
- **Atributos**:
  - `nome`: Nome do cliente.
  - `contas`: Lista de contas do cliente.
- **Métodos**:
  - `adicionarConta(Conta conta)`: Adiciona uma conta ao cliente.
  - `listarContas()`: Imprime o extrato de todas as contas do cliente.

#### Classe `Main`

- **Descrição**: Classe principal para testar o funcionamento das classes acima.
- **Método `main`**:
  - Cria um cliente chamado "João".
  - Cria uma `ContaCorrente` e uma `ContaPoupanca` para o cliente.
  - Adiciona as contas ao cliente.
  - Realiza operações de depósito, saque e transferência entre as contas.
  - Imprime os extratos das contas do cliente.

### Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        // Criação de um cliente
        Cliente cliente = new Cliente("João");

        // Criação de contas para o cliente
        Conta contaCorrente = new ContaCorrente("12345", 1000.0, 500.0);
        Conta contaPoupanca = new ContaPoupanca("67890", 2000.0);

        // Adicionando as contas ao cliente
        cliente.adicionarConta(contaCorrente);
        cliente.adicionarConta(contaPoupanca);

        // Realizando operações nas contas
        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaCorrente.transferir(contaPoupanca, 300);

        // Listando as contas e imprimindo os extratos
        cliente.listarContas();
    }
}
```

### O Que o Código Faz:

1. Cria um cliente chamado "João".
2. Cria uma conta corrente (`ContaCorrente`) com número "12345", saldo inicial de R$1000,00 e limite de crédito de R$500,00.
3. Cria uma conta poupança (`ContaPoupanca`) com número "67890" e saldo inicial de R$2000,00.
4. Adiciona as contas ao cliente.
5. Realiza um depósito de R$500,00 na conta corrente.
6. Realiza um saque de R$200,00 na conta corrente.
7. Transfere R$300,00 da conta corrente para a conta poupança.
8. Imprime os extratos das contas do cliente, mostrando os saldos atualizados.
