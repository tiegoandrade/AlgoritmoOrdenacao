package ordenacao;

public class Aplicacao {
	
	// Método onde será criado o vetor e executado cada método de ordenação
	public static void main(String[] args) {
		
		int [] vetor = {2, 5, 8, 9, 1, 15, 28, 12, 55, 42};
		
		QuickSort q1 = new QuickSort();
		q1.ordenarQMSort(vetor, 0, 9);
		q1.mostrarVetor(vetor);
	}

}
