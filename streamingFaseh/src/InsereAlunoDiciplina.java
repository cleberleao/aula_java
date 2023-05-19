public class InsereAlunoDiciplina {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina();
        disciplina.matricula = "RA25874878";
        disciplina.nome = "Cleber";

        disciplina.calculaMediaFinal(28,27.5,29);
        disciplina.calculaQtdeNotaFaltanteFinal();
    }
}
