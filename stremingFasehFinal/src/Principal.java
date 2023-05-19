import br.com.faseh.classes.Filme;
import br.com.faseh.classes.Serie;
import br.com.faseh.util.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
       Filme filme = new Filme();
       filme.setNome("Mario Bros");
       filme.setAnoDeLancamento(2023);
       filme.setDiretor("Steve");
       filme.setDuracaoEmMinutos(90);

       filme.exibeFichaTecnica();
       System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());

       Serie serie = new Serie();
       serie.setNome("Game of Thrones");
       serie.setAnoDeLancamento(2010);
       serie.setEpisodiosPorTemporada(9);
       serie.setTemporadas(8);
       serie.setMinutosPorEpisodios(50);
       serie.exibeFichaTecnica();
       System.out.println("Duração total das temporadas: "+serie.getDuracaoEmMinutos());

       Filme v10 = new Filme();
       v10.setNome("Velozes e furiosos 10");
       v10.setDiretor("Vin Disel");
       v10.setDuracaoEmMinutos(180);
       CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
       calculadoraDeTempo.incluiTempo(filme);
       calculadoraDeTempo.incluiTempo(serie);
       calculadoraDeTempo.incluiTempo(v10);
       System.out.println("Total de tempo da minha maratona é: "+calculadoraDeTempo.getTempoTotal() + " horas");
    }
}