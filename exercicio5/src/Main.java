//Faça um programa que imprima todos os resultados
// das tabuadas de 1, 2, 3, 4, 5, 6, 7, 8, 9 e 10.
// Utilize laço while e outras estruturas que julgar
// necessárias.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=10; j++){
                int mult = i*j;
                System.out.println("Tabuada do "+i + ":"
                + i + "*" + j + "=" + mult);
            }
        }
    }
}