package br.com.alura.modelo;

public class Filme extends Titulo {
	
	private String diretorio;
	
	public Filme(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	}

	public String getDiretorio() {
		return diretorio;
	}
	
	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}
	
	@Override
	public String toString() {
		return "Filme " + this.getNome() + "Lançado em " + getAnoDeLancamento();
	}
	
}
