package ordenacao;

public abstract class Ordenacao {
	
	protected int [] vetorOrd;
	
	public void ordenar(int[] valores){}
	
	public void ordenarQMSort(int[] valores, int inicio, int fim){};
	
	public void mostrarVetor(int x[]) {
		String mensagem = " Os valores ordenados são:";
		for (int indice = 0 ; indice < x.length; indice++) {
			int elemento = x[indice];
			mensagem = mensagem + " " + elemento;
		}
		System.out.println(mensagem);
	}
}
