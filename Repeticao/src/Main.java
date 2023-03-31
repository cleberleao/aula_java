import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        float media, soma = 0;
        Scanner num = new Scanner(System.in);
        while (contador<5){
            System.out.println("Digite um Número: ");
            soma = num.nextFloat() + soma;
            contador++;
        }
        media = soma / contador;
        System.out.println("A média é: "+media);
    }
}