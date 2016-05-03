package ordenacao;

public class SelectionSort extends Ordenacao {
	
	/* M�tedo que ordenar� o vetor pela t�cnica de Ordena��o por Sele��o. */
	public void ordenar(int[] valores) {
		int menorValor = 0; // Atributo que armazena o menor valor de um vetor.
		
		/* La�o que passa o valor do �ndice do vetor como menor n�mero. 
		 * Esse la�o percorre o vetor do primeiro at� o pen�ltimo valor do vetor.
		 */
		for (int i = 0; i < valores.length - 1; i++) {
			menorValor = i;
			
			/* La�o que verifica qual � o menor valor do vetor.
			 * Percorre do segundo at� o �ltimo valor do vetor.
			 */
			for (int j = i + 1; j < valores.length; j++) {
				if (valores[menorValor] > valores[j]){
					menorValor = j;
				}
			}
			
			/* Realiza a troca de posi��o entre dois valores do vetor.
			 * Considera o menor valor para que ele fique no in�cio do vetor. 
			 */
			if(menorValor != i) {
				int aux = valores[i];
				valores[i] = valores[menorValor];
				valores[menorValor] = aux;
			}
		}
	}
}
