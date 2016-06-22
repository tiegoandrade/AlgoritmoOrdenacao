package tiegoandrade.github.io.ordenadores;

import tiegoandrade.github.io.modelo.Ordenacao;

public class BubbleSort extends Ordenacao {
	
	/* M�tedo que ordenar� o vetor pela t�cnica de Ordena��o Bolha. */
	public void ordenar(int[] valores) {
		
		/* La�o percorrer� o vetor da �ltima posi��o at� a segunda posi��o */
		for (int i = valores.length - 1; i > 0; i--) {
			
			/* 
			 * La�o que percorrer� desde o �ltimo elemento at�
			 * a posi��o onde se encontra o valor do �ndice "i" 
			 */
			for (int j = 0; j < i; j++) {
				
				// Condi��o que verifica se um valor � menor que o outro e realiza uma troca.
				if (valores[j] > valores[j + 1]) { 
					int aux = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = aux;
				}
			}
		}
	}
}
