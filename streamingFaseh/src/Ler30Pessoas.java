import java.util.ArrayList;
import java.util.Scanner;

//Escrever um programa que leia o nome e o sexo
// de 30 pessoas e informe o nome e se ela é homem
// ou mulher. No final informe total de homens e de
// mulheres.
public class Ler30Pessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> sexos = new ArrayList<>();
        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();
        System.out.println("Programa inserir Nome e Sexo");
        for (int i=0;i<30;i++){
            System.out.println("Digite o Nome");
            nomes.add(scanner.next().toUpperCase());
            System.out.println("Digite M ou F");
            sexos.add(scanner.next().toUpperCase());
        }
        for (int i=0;i<30;i++) {
            if(sexos.get(i).equals("M")){
                homens.add(nomes.get(i));
            } else if(sexos.get(i).equals("F")){
                mulheres.add(nomes.get(i));
            }
        }
        System.out.println(homens);
        System.out.println("Numero de homens: "+ homens.size());
        System.out.println(mulheres);
        System.out.println("Numero de mulheres: "+ mulheres.size());
    }
}
