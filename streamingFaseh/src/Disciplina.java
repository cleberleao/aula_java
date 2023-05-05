//Escreva uma classe cujos objetos representam
// alunos matriculados em uma disciplina. Cada
// objeto dessa classe deve guardar os seguintes
// dados do aluno: matrícula, nome, 2 notas de prova
// e 1 nota de trabalho. Escreva os seguintes métodos
// para esta classe:
// media: calcula a média final do aluno
// (cada prova tem peso 2,5 e o trabalho tem peso 2)
//final: calcula quanto o aluno precisa para a prova
// final (retorna zero se ele não for para a final)

public class Disciplina {
    String matricula;
    String nome;
    private double prova1;
    private double prova2;
    private double notaTrabalho;
    private double media;

    void calculaMediaFinal (double prova1, double prova2, double notaTrabalho){
        this.prova1 = prova1 * 2.5;
        this.prova2 = prova2 * 2.5;
        this.notaTrabalho = notaTrabalho * 2;
        this.media = (this.prova1 + this.prova2 + this.notaTrabalho)/3;
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println("Media é = " + this.media);
    }

    void calculaQtdeNotaFaltanteFinal(){
        if (this.media < 60){
            double notaFinal = 60 - this.media;
            System.out.println("Falta " + notaFinal + " pontos para prova final");
        } else {
            System.out.println("Falta 0 pontos");
        }
    }
}
