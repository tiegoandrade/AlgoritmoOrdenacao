package tiegoandrade.github.io.testes;

import tiegoandrade.github.io.ordenadores.ShellSort;

public class Aplicacao {
	
	// M�todo onde ser� criado o vetor e executado cada m�todo de ordena��o.
	public static void main(String[] args) {
		
		int [] vetor = {2, 5, 8, 9, 1, 15, 28, 12, 55, 42};
		
		ShellSort q1 = new ShellSort();
		q1.shellSort(vetor);
		q1.mostrarVetor(vetor);
	}

}
