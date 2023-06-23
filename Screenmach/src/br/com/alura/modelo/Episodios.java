package br.com.alura.modelo;

import br.com.alura.calculo.Classificavel;

public class Episodios implements Classificavel	{
	
	private int numero;
	private String nome;
	private String serie;
	private int totalDeVisualizacoes;
	
	public  int  getTotalVisualizações () {
        return  getTotalVisualizações() ;
    }
	
	public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
		this.totalDeVisualizacoes = totalDeVisualizacoes;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSerie() {
		return serie;
	}
	
	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Override
	public int getClacificacao() {
		if(getTotalVisualizações() > 100) {
			return 4;
		} else {
			return 2;
		}
	}
	
	

}

