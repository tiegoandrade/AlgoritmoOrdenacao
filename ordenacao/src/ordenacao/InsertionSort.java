package ordenacao;

public class InsertionSort extends Ordenacao {
	
	/* Métedo que ordenará o vetor pela técnica de Ordenação por Inserção. */
	public void ordenar(int[] valores) {
		
		/*
		 * Laço que percorre o vetor da segunda posição à última, 
		 * colocando seus valores em uma variável temporária 
		 */
		for (int i = 1; i < valores.length; i++) {
			int temp = valores[i];
			int j;
			
			/*
			 * Laço que percorre o vetor uma posição a menos do que a variável "i".
			 * Se o valor que está no ínicio do vetor já for o menor, há um break,
			 * Se não é realizado uma troca.
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
