package ordenacao;

public class SelectionSort extends Ordenacao {
	
	/* Métedo que ordenará o vetor pela técnica de Ordenação por Seleção. */
	public void ordenar(int[] valores) {
		int menorValor = 0; // Atributo que armazena o menor valor de um vetor.
		
		/* Laço que passa o valor do índice do vetor como menor número. 
		 * Esse laço percorre o vetor do primeiro até o penúltimo valor do vetor.
		 */
		for (int i = 0; i < valores.length - 1; i++) {
			menorValor = i;
			
			/* Laço que verifica qual é o menor valor do vetor.
			 * Percorre do segundo até o último valor do vetor.
			 */
			for (int j = i + 1; j < valores.length; j++) {
				if (valores[menorValor] > valores[j]){
					menorValor = j;
				}
			}
			
			/* Realiza a troca de posição entre dois valores do vetor.
			 * Considera o menor valor para que ele fique no início do vetor. 
			 */
			if(menorValor != i) {
				int aux = valores[i];
				valores[i] = valores[menorValor];
				valores[menorValor] = aux;
			}
		}
	}
}
