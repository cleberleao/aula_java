//Faça uma classe com um método
// que será usado em sistema
//  que irá verificar se um valor é
//  perfeito ou não. Um valor é dito
//  perfeito quando ele é igual a soma
//  dos seus divisores excetuando ele
//  próprio. (Ex: 6 é perfeito,
//  6 = 1 + 2 + 3, que são seus
//  divisores). O método deve retornar
//  um valor booleano.

public class NumeroPerfeito {
    private int numero;
    private int temporario;
    private String divisores;


    public boolean numeroPerfeito(int numero) {
        this.numero = numero;
        boolean resposta = false;
        if (this.numero == 1) {
            resposta = false;
        } else if (this.numero > 2) {
            temporario = 0;
            divisores = ""; // seqüência de divisores
            for (int i = 1; i <= (this.numero / 2); i++) {
                if ((this.numero % i) == 0) {
                    temporario += i;
                    if (divisores.length() > 0) {
                        divisores += (" + " + i);    // concatena os divisores
                    } else {
                        divisores = ("= " + i);   // na variável string "divisores"
                    }
                }
                else {
                    resposta = false;
                }
                if (this.numero == temporario){
                    resposta = true;
                }
            }
        }
        return resposta;
    }
}


