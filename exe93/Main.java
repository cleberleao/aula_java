
//contruir um algoritmo que leia dois valores
// numéricos inteiros e efetue a adição; caso o
// resultado seja maior que 10, apresentá-lo

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            int num1, num2, soma;
            Scanner valor1 = new Scanner(System.in);
            Scanner valor2 = new Scanner(System.in);
            System.out.println("Digite o primeiro numero: ");
            num1 = valor1.nextInt();
            System.out.println("Digite o segundo numero: ");
            num2 = valor2.nextInt();
            soma = num1+num2;
            if(soma > 10){
                System.out.println("O numero é maior que 10: "+soma);
            }
            else if(soma <= 10){
                System.out.println("O número é menor que 10: "+soma);
            }
        }

}

