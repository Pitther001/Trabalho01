package Ex03;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class ContaBancaria {
    private double saldo;
    private String titular;
    private int numeroConta;
    private List<Transacao> historico;

    public ContaBancaria(String titular, int numeroConta, double saldoInicial) {
        this.saldo = saldoInicial;
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.historico = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo =saldo + valor;
            historico.add(new Transacao(titular, "Depósito", valor, LocalDateTime.now()));
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo = saldo - valor;
            historico.add(new Transacao(titular, "Saque", valor, LocalDateTime.now()));
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    /*public List<Transacao> getHistorico() {
        return historico;
    }*/

    public void getHistorico() {
        System.out.println("Histórico de transações:");
        for (Transacao t : historico) {
            System.out.println(t);
        }
        System.out.println("Saldo atual: R$" + saldo);
    }


}
