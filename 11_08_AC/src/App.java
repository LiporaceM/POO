public class App {
    //M = (AP1 + AP2) * 0.4 + AC * 0.2
    public static void main(String[] args) throws Exception {
        media(8,5,10);
        numeros();
        ePrimo(50);
        semana(4);
        bissexto(1900);
    }
    public static void media(double AP1,double AP2,double AC){
        System.out.println((AP1 + AP2) * 0.4 + AC * 0.2);
    }
    public static void numeros(){
        for(int i = 150; i<=200;i++) {
            System.out.println(i);
    }
    }
    public static void ePrimo(int num){
        int c =1;
        for (int i = 1;i <=100;i++){
            if (num != i && num % i == 0)
            c++;
        }
        if(c>2){
            System.out.println("Não é primo");
            for (int i =1;i<=num;i++){
                if (num% i==0){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Numero é primo");
        }
    }
    public static void semana(int num){
        switch (num) {
            case 1:
            System.out.println("Segunda");
            break;
            case 2:
            System.out.println("Terça");
            break;
            case 3:
            System.out.println("Quarta");
            break;
            case 4:
            System.out.println("Quinta");
            break;
            case 5:
            System.out.println("Sexta");
            break;
            case 6:
            System.out.println("Sabado");
            break;
            case 7:
            System.out.println("Domingo");
            break;
        default:
        System.out.println("Opção invalida");

    }
    
    }
    public static void bissexto(int num){
        if (num % 4 == 0 || num % 4 == 0 && num % 100 == 0 && num % 400 == 0){
        System.out.println("Ano Bissexto");
    } else {
        System.out.println("Não Bissexto");
    }
}
}