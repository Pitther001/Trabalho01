package Ex03;
import java.time.LocalDateTime;

public class Transacao {
    private String nome;
    private String tipo;
    private double valor;
    private LocalDateTime data;

    public Transacao(String nome, String tipo, double valor, LocalDateTime data) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    @Override
    public String toString() {
        return nome + " - " + tipo + " de R$" + valor + " em " + data;
    }

}
