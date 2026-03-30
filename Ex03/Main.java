package Ex03;
/*  Exercicio 3 // Conta Bancaria & Transações

Uma conta bancária deve permitir depósitos, saques e consultas de saldo. Implemente uma classe `ContaBancaria` com os seguintes métodos:
- **depositar(double valor)**: Adiciona o valor ao saldo.
- **sacar(double valor)**: Remove o valor do saldo, se houver saldo suficiente.
- **consultarSaldo()**: Retorna o saldo atual.

Além disso, cada transação feita, deve ser registrada em um histórico. Implemente um método `getHistorico()` que retorna a lista de transações realizadas (depósitos e saques).

A transação também deve ser uma classe, chamada `Transacao`, com os seguintes atributos:
- `tipo` (String): "depósito" ou "saque"
- `valor` (double)
- `data` (LocalDateTime)*/


public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Tiago", 12345, 1000.0);
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.depositar(300.0);
        conta.depositar(2000.0);
        conta.sacar(1500.0);
        conta.sacar(100000.0);
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
        
        /*System.out.println("Histórico de transações:");
        for (Transacao t : conta.getHistorico()) {
            System.out.println(t);
        }*/

        conta.getHistorico();
    }
    
}
