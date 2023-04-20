//Faça um programa que:
//leia uma quantidade x de números que serão digitados.
// Por exemplo: 5 ler estes x números e
// concomitantemente realizar a soma dos valores
// sendo digitados. Utilize laço while e outras
// estruturas que julgar necessárias.
// Exibir o resultado da soma dos x números digitados.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a ser digitado");
        int num = scanner.nextInt();
        int soma = 0;
        for(int i=1; i<=num; i++){
            System.out.println("Digite o numero "+i+ ": ");
            soma = scanner.nextInt() + soma;
        }
        System.out.println("Resultado da soma: " + soma);
    }
}