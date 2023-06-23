package br.com.alura.teste;

import java.util.ArrayList;

import br.com.alura.modelo.Filme;
import br.com.alura.modelo.Serie;
import br.com.alura.calculo.CalculadorDeTempo;

public class teste {
	public static void main(String[] args) {
		
		CalculadorDeTempo calcula = new CalculadorDeTempo();
		
		Filme filme = new Filme("Avatar", 200);
		
		filme.setNome("avatar");
		filme.setDuracaoEmMinutos(200);
		
		var filmeDoNeto = new Filme("Tron", 130);
		filmeDoNeto.setNome("tron");
		filmeDoNeto.setDuracaoEmMinutos(200);
		
		
		var filmeDaMonny = new Filme("gente grande", 100);
		
		filmeDaMonny.setNome("Enrolados");
		filmeDaMonny.setDuracaoEmMinutos(200);
		
		Serie serie = new Serie("demon Slayer", 200);
		
		serie.setNome("friends");
		serie.setTemproradas(5);
		serie.setMinutosPorEpisodio(100);
		
		System.out.println(filmeDaMonny.getNome());
		System.out.println(filmeDaMonny.getDuracaoEmMinutos());
		
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		
		listaDeFilmes.add(filmeDaMonny);
		listaDeFilmes.add(filme);
		listaDeFilmes.add(filmeDoNeto);
		
		System.out.println(listaDeFilmes);
		
		System.out.println("Listas de filmes " + listaDeFilmes.size());
		
	}

}
