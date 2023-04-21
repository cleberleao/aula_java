public class Filme {
    String nomeDoFilme;
    int anoFilme;
    int duracao;
    String genero;
    int avaliacao;
    private double notasAvaliacoes;
    private int totalAvaliacoes;

    void descreverFilme(){
        System.out.println("Nome do Filme: " + nomeDoFilme);
        System.out.println("Ano Lançamento: "+ anoFilme);
        System.out.println("Duração: "+ duracao);
    }
    void avaliarFilme(int nota){
        //notasAvaliacoes = nota + notasAvaliacoes;
        notasAvaliacoes += nota; //a mesma coisa da linha acima
        totalAvaliacoes++;
    }
    double mediaDasNotas(){
        return notasAvaliacoes/totalAvaliacoes;
    }
}
