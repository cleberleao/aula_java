public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nomeDoFilme = "Mario Bros";
        filme.anoFilme = 2023;
        filme.duracao = 90;
        filme.descreverFilme();
        filme.avaliarFilme(9);
        filme.avaliarFilme(4);
        filme.avaliarFilme(6);
        filme.avaliarFilme(8);
        System.out.println();
        System.out.println(filme.mediaDasNotas());
    }
}