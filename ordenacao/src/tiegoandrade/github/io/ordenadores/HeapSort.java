package tiegoandrade.github.io.ordenadores;

import tiegoandrade.github.io.modelo.Ordenacao;

public class HeapSort extends Ordenacao {
	
	/* M�tedo que ordenar� o vetor pela t�cnica de Ordena��o por Heap. */
	public void ordenar(int[] valores) {
		buildMaxHeap(valores); 
		int comprimento = valores.length;
		
		for (int i = valores.length - 1; i > 0; i--) {
			swap(valores, i, 0);
			maxHeapify(valores, 0, --comprimento);
		}
	}
	
	/* Chama um m�todo que converte um vetor em um heap de m�ximo */
	private void buildMaxHeap(int[] valores) {
		for (int i = (valores.length / 2) - 1; i >= 0; i--) {
			maxHeapify(valores, i, valores.length);
		}
	}
	
	/* M�todo que mant�m a propriedade de um heap no m�ximo.  */
	private void maxHeapify(int[] valores, int pos, int tamanhoDoVetor ) {
		int max = (2 * pos) + 1;
		int direito = max + 1 ;
		
		if (max < tamanhoDoVetor) {
			if (direito < tamanhoDoVetor && valores[max] < valores[direito]) {
				max = direito;
			} 
			
			if (valores[max] > valores[pos]) {
				swap(valores, max, pos);
				maxHeapify(valores, max, tamanhoDoVetor);
			}
		}
	}
	
	/* M�todo que realiza a troca entre dois valores em um vetor. */
	private void swap(int[] valores, int j, int aposJ) {
		int aux = valores[j];
		valores[j] = valores[aposJ];
		valores[aposJ] = aux;
	}
}

