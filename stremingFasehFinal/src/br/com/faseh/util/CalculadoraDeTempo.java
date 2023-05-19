package br.com.faseh.util;

import br.com.faseh.classes.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiTempo(Titulo t){
        System.out.println("Acionando a duração total em minutos:" + t);
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
//    public void incluiTempo(Filme f){
//        System.out.println("Acionando a duração total em minutos:" + f);
//        this.tempoTotal = f.getDuracaoEmMinutos();
//    }
}
