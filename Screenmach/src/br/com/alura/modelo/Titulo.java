package br.com.alura.modelo;


import br.com.alura.exececoes.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	private int avalia;

	public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}

	public Titulo(TituloOmdb meuTituloOmdb)  {
		this.nome = meuTituloOmdb.title();

		if(meuTituloOmdb.year().length() > 4){
			throw new ErroDeConversaoDeAnoException("Não consegue converter o ano" +
					"porque tem mais de 4 caracteres");
		}

		this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
		this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
	}

	public String getNome() {
		return nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public boolean incluidoNoPlano() {
		return incluidoNoPlano;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
		}

	public int getTotalDeAvaliaces() {
		return totalDeAvaliacoes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibeFichaTecnica() {
		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	}

	public <nota> void avalia(nota dupla, double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}

	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}

	public int getAvalia() {
		return avalia;
	}

	public void setAvalia(int avalia) {
		this.avalia = avalia;
	}

	@Override
	public int compareTo(Titulo outroTitulo) {
		return this.getNome().compareTo(outroTitulo.getNome());
	}

	@Override
	public String toString() {
		return "nome" + nome +
       ", anoDeLancamento =" + anoDeLancamento + "," +  "duração" + duracaoEmMinutos;
	}
}
