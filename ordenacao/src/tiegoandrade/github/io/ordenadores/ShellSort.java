package tiegoandrade.github.io.ordenadores;

import tiegoandrade.github.io.modelo.Ordenacao;

public class ShellSort extends Ordenacao {
	
	public void shellSort(int[] valores) {
		// Vari�veis que v�o se comparar para definir o maior e o menor valor.
		int inner, outer;
		
		// Vari�vel que armazena um dos valores do array temporariamente.
		int temp;
		
		// Vari�vel que representa o incremento de shell.
		int h = 1;
		
		// Seleciona o valor de incremento de shell.
		while (h <= valores.length / 3 ) {
			h = h * 3 + 1;
		}
		
		// La�o que decrementa o incremento de shell at� o valor 1.
		while ( h > 0) {
			
			// La�o que compara e realiza a troca de lugares 
			for (outer = h; outer < valores.length; outer++) {
				temp = valores[outer];
				inner = outer;
				 
				while (inner > h - 1 && valores[inner - h] >= temp) {
					valores[inner] = valores[inner - h];
					inner -= h;
				}
				
				valores[inner] = temp;
			}
			
			// Decrementa os valores do incremento de shell.
			h = (h - 1) / 3;
		 }
	}
}
