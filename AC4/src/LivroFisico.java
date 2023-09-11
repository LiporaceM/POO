public class LivroFisico extends Livro{
    public LivroFisico(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
    }
    public void emprestar() {
        if (reservado && !emprestado) {
            emprestado = true;
            System.out.println("O livro "+nome + " foi emprestado com sucesso.");
        } else if (!reservado) {
            System.out.println("O livro "+nome + " precisa ser reservado primeiro.");
        } else {
            System.out.println("O livro "+nome + " já está emprestado.");
        }
    }
    
    public void devolver() {
        if (emprestado) {
            emprestado = true;
            System.out.println("O livro "+nome + " foi devolvido.");
        } else {
            System.out.println("O livro "+nome + " não estava emprestado.");
        }
    }
}
