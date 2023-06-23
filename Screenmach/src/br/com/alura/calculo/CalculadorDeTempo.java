package br.com.alura.calculo;

import br.com.alura.modelo.Titulo;

public class CalculadorDeTempo {
	
	private int tempoTotal;
	
	public int getTempoTotal() {
		return tempoTotal;
	}
	
	public void inclui(Titulo titulo) {
		System.out.println("Adiciona duração em minutos de " + titulo);
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
	
}
