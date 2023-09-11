public class Ebook extends Livro{
    String formato;
    public Ebook(String nome, String autor, String formato){
        this.nome = nome;
        this.autor = autor;
        this.formato = formato;
    }
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("A reserva de " + nome + " foi cancelada.");
        } else {
            System.out.println("O livro "+nome + " não estava reservado.");
        }
    
    }
}
