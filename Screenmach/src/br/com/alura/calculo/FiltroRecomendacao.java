package br.com.alura.calculo;

public class FiltroRecomendacao {
	
	private String recomendacao;
	
	public void filtra(Classificavel classificavel) {
		if(classificavel.getClacificacao() >= 4) {
			System.out.println("esta entre os favoritos do momento");		
		} else if(classificavel.getClacificacao() >= 2) {
			System.out.println("muito bem avaliado no momento");
		} else {
			System.out.println("coloque na sua lista para assistir depois");
			
		}
	}

}
