import java.util.Scanner;

public class Painel {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Evento evento1;
        Aluno aluno1;
        Palestra palestra1;
        evento1 = new Evento();
        aluno1 = new Aluno();
        palestra1 = new Palestra();
        
        while (true){
        System.out.println("[1] Cadastrar evento , [2] Inscrever-se em evento , [3] Visão Geral do evento , [4] Sair");
        int opcao = leitor.nextInt();
           if (opcao == 1){
            System.out.println("Digite o nome do evento: ");
               String nomeEvento = leitor.next();
               evento1.nomeEvento = nomeEvento;
            System.out.println("Digite a data do evento: ");
               String dataEvento = leitor.next();
               evento1.dataEvento = dataEvento;
            System.out.println("Digite o local do evento: ");
               String localEvento = leitor.next();
               evento1.localEvento = localEvento;
            System.out.println("Digite a capacidade do evento: ");
               int numeroMaximo = leitor.nextInt();
               evento1.numeroMaximo = numeroMaximo;
            System.out.println("nome: "+nomeEvento);
            System.out.println("data: "+dataEvento);
            System.out.println("local: "+localEvento);
            System.out.println("capacidade: "+numeroMaximo);
            continue;
           }
           if (opcao == 2){
            System.out.println("Digite seu nome: ");
            String nomeAluno = leitor.next();
            aluno1.nomeAluno = nomeAluno;
            System.out.println("Digite sua matricula: ");
            String matriculaAluno = leitor.next();
            aluno1.matriculaAluno = matriculaAluno;
            evento1.numeroMaximo -= 1;
            continue;
           }
           if (opcao == 3){
            System.out.println("nome: "+evento1.nomeEvento);
            System.out.println("data: "+evento1.dataEvento);
            System.out.println("local: "+evento1.localEvento);
            System.out.println("Vagas: "+evento1.numeroMaximo);
            System.out.println("Palestrante: "+palestra1.nomePalestrante);
            continue;
           }
           if (opcao == 4){
            leitor.close();
            break;
           }
           else {
                System.out.println("Opção Invalida!");
                continue;
            }
        }

    }
}
