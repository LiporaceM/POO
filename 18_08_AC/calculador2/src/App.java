import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programa = true;
        boolean contador = true;
        double numero;
        double outronumero;
        String operacao;

        while (programa) {
            System.out.println("Digite um numero: ");
            numero = scanner.nextDouble();
            while(contador) {
            System.out.println("Número atual: " + numero);
            System.out.println("Digite um operador: + , - , / , *");            
            operacao = scanner.next();
            System.out.println("Digite outro numero");
            outronumero = scanner.nextDouble();
            if (operacao.equals("+")){
                numero += outronumero;
            }
            else if (operacao.equals("-")){
                numero -= outronumero;
            }
             else if (operacao.equals("/")){
                numero /= outronumero;
            }
             else if (operacao.equals("*")){
                numero *= outronumero;
            }
            else{
                System.out.println("Operador invalido");
                continue;
                }
            }
            }


        }
    }

