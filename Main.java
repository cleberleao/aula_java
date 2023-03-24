import java.util.Scanner;

//Entrar com um número e imprimi-lo caso seja
// maior que 20
public class Main {
    public static void main(String[] args) {
        double num;
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = valor.nextDouble();

        if(num > 20.0){
            System.out.println("O numero é maior que 20: "+num);
        }
        else if(num <= 20.0){
            System.out.println("O número é menor que 20: "+num);
        }


    }
}


//        int num1 = 5;
//        int num2 = 7;
//        int soma;
//        String nome = "Cleber ";
//        String sobrenome = "Leão";
//        soma = num1+num2;
//        String nomeSobrenome = nome+sobrenome;
//        System.out.println("soma de num1 + num2 é = " + nomeSobrenome);


