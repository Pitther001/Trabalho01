package Ex04;
 /*## Exercicio 4 // Biblioteca

### Classe `Biblioteca` com Listas de Objetos

**Descrição:**
Crie uma classe `Livro` com os seguintes atributos e respectivo métodos getters e setters:
- `titulo` (String)
- `autor` (String)
- `disponivel` (boolean)

Crie uma classe `Biblioteca` que tenha uma lista de livros como atributo. Implemente os seguintes métodos na classe `Biblioteca`:
- **AdicionarLivro(Livro livro)**: Adiciona um livro à lista.
- **EmprestarLivro(String titulo)**: Marca o livro como indisponível.
- **DevolverLivro(String titulo)**: Marca o livro como disponível.
- **ListarLivros()**: Exibe a lista de livros com seu status (disponível ou não).

**Tarefa:**
Crie um arquivo Main.java que teste a classe biblioteca. Adicione livros à biblioteca, empreste e devolva alguns, e exiba o estado dos livros usando o método `ListarLivros()`. */
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("A Revolução dos Bichos", "George Orwell");

        Biblioteca biblioteca = new Biblioteca(new java.util.ArrayList<>());
        biblioteca.AdicionarLivro(livro1);
        biblioteca.AdicionarLivro(livro2);
        biblioteca.AdicionarLivro(livro3);

        System.out.println("Livros disponíveis na biblioteca:");
        biblioteca.getLivros();

        System.out.println("\nEmprestando '1984'...");
        biblioteca.EmprestarLivro("1984");

        System.out.println("\nEstado dos livros após o empréstimo:");
        biblioteca.getLivros();

        System.out.println("\nDevolvendo '1984'...");
        biblioteca.DevolverLivro("1984");

        System.out.println("\nEstado dos livros após a devolução:");
        biblioteca.getLivros();

    }
}
