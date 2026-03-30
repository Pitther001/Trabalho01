package Ex04;

import java.util.List;

public class Biblioteca {
    private List<Livro> livros;


    public Biblioteca(List<Livro> livros) {
        this.livros = livros;
    }

    public void AdicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void EmprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                livro.setDisponivel(false);
                System.out.println("Livro emprestado: " + titulo);
                return;
            }
        }
        System.out.println("Livro não encontrado ou indisponível: " + titulo);
    }

    public void DevolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isDisponivel()) {
                livro.setDisponivel(true);
                System.out.println("Livro devolvido: " + titulo);
                return;
            }
        }
        System.out.println("Livro não encontrado ou já disponível: " + titulo);
    }

    public void getLivros() {
        for (Livro livro : livros) {
        System.out.println(livro);
        }
    }
}
