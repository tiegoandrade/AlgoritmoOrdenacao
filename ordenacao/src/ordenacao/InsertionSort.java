package ordenacao;

public class InsertionSort extends Ordenacao {
	
	/* M�tedo que ordenar� o vetor pela t�cnica de Ordena��o por Inser��o. */
	public void ordenar(int[] valores) {
		
		/*
		 * La�o que percorre o vetor da segunda posi��o � �ltima, 
		 * colocando seus valores em uma vari�vel tempor�ria 
		 */
		for (int i = 1; i < valores.length; i++) {
			int temp = valores[i];
			int j;
			
			/*
			 * La�o que percorre o vetor uma posi��o a menos do que a vari�vel "i".
			 * Se o valor que est� no �nicio do vetor j� for o menor, h� um break,
			 * Se n�o � realizado uma troca.
			 */
			for (j = i - 1; j >= 0; j--) {
				if (valores[j] < temp){
					break;
				} else {
					valores[j + 1] = valores[j];
				}
				valores[j] = temp;	
			}
			
		}
	}
}
