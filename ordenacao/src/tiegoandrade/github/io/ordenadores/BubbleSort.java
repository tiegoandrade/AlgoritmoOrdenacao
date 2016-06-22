package tiegoandrade.github.io.ordenadores;

import tiegoandrade.github.io.modelo.Ordenacao;

public class BubbleSort extends Ordenacao {
	
	/* Métedo que ordenará o vetor pela técnica de Ordenação Bolha. */
	public void ordenar(int[] valores) {
		
		/* Laço percorrerá o vetor da última posição até a segunda posição */
		for (int i = valores.length - 1; i > 0; i--) {
			
			/* 
			 * Laço que percorrerá desde o último elemento até
			 * a posição onde se encontra o valor do índice "i" 
			 */
			for (int j = 0; j < i; j++) {
				
				// Condição que verifica se um valor é menor que o outro e realiza uma troca.
				if (valores[j] > valores[j + 1]) { 
					int aux = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = aux;
				}
			}
		}
	}
}
