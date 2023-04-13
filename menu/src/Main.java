import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Digite uma opção do Menu de 1-8");
        System.out.println("Digite 1 para Converter Cº / Fº");
        System.out.println("Digite 2 para Converter R$ / $");
        System.out.println("Digite 3 para Area Retangulo/Circunferencia/Triangulo");
        System.out.println("Digite 4 para verificar se o numero é divisivel por 3/7");
        System.out.println("Digite 5 para primeira letra/ultima/meio");
        System.out.println("Digite 6 para votante ou IMC");
        System.out.println("Digite 7 para nº real parte inteira/fracionada/arredondado");
        System.out.println("Digite 8 para Todas Maiusculas todas Minusculas");
        opcao = scanner.nextInt();
        switch (opcao){
            case 1: {
                String s;
                System.out.println("Digite C para celsius e F para Fahrenheit");
                s = scanner.next().toLowerCase(Locale.ROOT);
                int valor;
                if(s.equals("f")){
                    System.out.println("Digite um valor em Cº para converter Fº");
                    valor = scanner.nextInt();
                    System.out.println("Valor é: "+(5*valor+160)/5);
                } else if (s.equals("c")) {
                    System.out.println("Digite um valor em Fº para converter Cº");
                    valor = scanner.nextInt();
                    System.out.println("Valor é: "+(5*valor-160)/9);
                } else {
                    System.out.println("Valor inválido");
                }
                break;
            }
            case 2: {
                String s;
                System.out.println("Digite R para Real e D para Dolar");
                s = scanner.next().toLowerCase(Locale.ROOT);
                int valor;
                if(s.equals("r")){
                    System.out.println("Digite um valor em R$ para converter $");
                    valor = scanner.nextInt();
                    System.out.println("Valor é: "+(valor/5));
                } else if (s.equals("d")) {
                    System.out.println("Digite um valor em $ para converter R$");
                    valor = scanner.nextInt();
                    System.out.println("Valor é: "+(valor*5));
                } else {
                    System.out.println("Valor inválido");
                }
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                break;
            }
            case 7: {
                break;
            }
            case 8: {
                String s;
                System.out.println("Digite MAI para Maiusculas e MIN para Minusculas");
                s = scanner.next().toLowerCase(Locale.ROOT);
                if(s.equals("mai")){
                    System.out.println("Digite um nome para ficar maiuscula");
                    System.out.println("Maiuscula: "+ scanner.next().toUpperCase(Locale.ROOT));
                } else if (s.equals("min")) {
                    System.out.println("Digite um nome para ficar minuscula");
                    System.out.println("Minuscula: "+ scanner.next().toLowerCase(Locale.ROOT));
                } else {
                    System.out.println("Valor inválido");
                }
                break;
            }
            default:{
                System.out.println("Opção incorreta");
            }
        }
    }
}