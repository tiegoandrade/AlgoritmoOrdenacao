package ordenacao;

public class QuickSort extends Ordenacao {
	
	/* M�tedo que ordenar� o vetor pela t�cnica Quick Sort */
	public void ordenarQMSort(int[] valores, int inicio, int fim) {
		
		/* Divide o vetor e realiza sua ordena��o por meio da recursividade */
		if (inicio < fim) {
			int q = partition(valores, inicio, fim);
			ordenarQMSort(valores, inicio, q - 1);
			ordenarQMSort(valores, q + 1, fim);
		}
	}
	
	/* M�todo que ordena o vetor */
	private int partition(int[] valores, int inicio, int fim) {
		int pivo = valores[fim]; // � escolhido um pivor
		int baixo = inicio - 1;
		
		/* 
		 * � criado dois arranjos, um com valores menores ou iguais ao pivor
		 * e o outro maiores que o pivor
		 */
		for (int alto = inicio; alto < fim; alto++) {
			if (valores[alto] <= pivo) {
				swap(valores, ++baixo, alto);
			}
		}
		swap(valores, ++baixo, fim);
		return baixo; // retorna o valor do meio do vetor.
	}
	
	/* M�todo que troca valores de um vetor */
	private void swap(int[] valores, int j, int aposJ) {
		int aux = valores[j];
		valores[j] = valores[aposJ];
		valores[aposJ] = aux;
	}
}