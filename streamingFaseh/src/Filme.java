public class Filme {
    private String nomeDoFilme;
    private int anoFilme;
    private int duracao;
    private String genero;
    private int avaliacao;
    private double notasAvaliacoes;
    private int totalAvaliacoes;

    public Filme(String nomeDoFilme, int anoFilme, int duracao, String genero) {
        this.nomeDoFilme = nomeDoFilme;
        this.anoFilme = anoFilme;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public int getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getNotasAvaliacoes() {
        return notasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public Filme(){

    }
    private void descreverFilme(){
        System.out.println("Nome do Filme: " + nomeDoFilme);
        System.out.println("Ano Lançamento: "+ anoFilme);
        System.out.println("Duração: "+ duracao);
    }
    private void avaliarFilme(int nota){
        //notasAvaliacoes = nota + notasAvaliacoes;
        notasAvaliacoes += nota; //a mesma coisa da linha acima
        totalAvaliacoes++;
    }
    private double mediaDasNotas(){
        return notasAvaliacoes/totalAvaliacoes;
    }
}
