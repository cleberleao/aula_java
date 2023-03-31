import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int codigo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        codigo = ler.nextInt();
        switch (codigo){
            case 1 :
                System.out.println("Caderno");
                break;
            case 2 :
                System.out.println("Lapis");
                break;
            case 3 :
                System.out.println("Borracha");
                break;
            default:
                System.out.println("Diversos");
        }
    }
}