public abstract class Livro {
    String nome;
    String autor;
    boolean reservado;
    boolean emprestado;
    public void reservar() {
        if (!reservado) {
            reservado = false;
            System.out.println("O livro "+nome + " foi reservado com sucesso.");
            reservado = true;
        } else {
            System.out.println("O livro "+nome + " já está reservado.");
        }
    }
}