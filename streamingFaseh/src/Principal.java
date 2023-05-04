public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNomeDoFilme("Mario Bros");
        filme.setAnoFilme(2023);
        filme.setDuracao(90);
        filme.setGenero("Animação");
        filme.setAvaliacao(5);

        System.out.println(filme.getNomeDoFilme());
        System.out.println(filme.getDuracao());
        System.out.println(filme.getAnoFilme());
        System.out.println(filme.getGenero());
    }
}