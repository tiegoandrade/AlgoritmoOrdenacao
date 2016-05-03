package ordenacao;

public class MergeSort extends Ordenacao {
	
	/* Métedo que ordenará o vetor pela técnica de Ordenação por intercalação. */
	public void ordenarQMSort(int[] valores, int inicio, int fim) {
		
		/* Divide o vetor ao meio e ordena recursivamente dois vetores */
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenarQMSort(valores, inicio, meio);
			ordenarQMSort(valores, meio + 1, fim);
			merge(valores, inicio, meio, fim);
		}
	}
	
	/* Método que intercala dois vetores ordenados. */
	private void merge(int[] valores, int inicio, int meio, int fim) {
		int[] vetorTemp = new int[valores.length];
		
		/* Copia todos os elementos de um vetor para outro temporário */
		for (int i = inicio; i <= fim; i++) {
			vetorTemp[i] = valores[i];
		}
		
		/* Percorre 2 vetores lógicos copiando o menor dos valores */
		int i = inicio;
		int j = meio + 1;
		int k = inicio;
		
		while (i <= meio && j <= fim){
			if (vetorTemp[i] <= vetorTemp[j]) {
				valores[k] = vetorTemp[i];
				i++;
			} else {
				valores[k] = vetorTemp[j];
				j++;
			}
			
			k++;
		}
		
		/* Copia o restante dos elementos */
		while (i <= meio){
			valores[k] = vetorTemp[i];
			k++;
			i++;
		}
	}
}
