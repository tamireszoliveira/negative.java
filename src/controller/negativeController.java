package controller;

public class negativeController{
	
	/*4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N
posições, passado como parâmetro:
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior*/
	
	public negativeController() {
		super();
	}
	
	public static int negativos(int[] vetor, int  n){
		// o ponto de parada é quando o vetor chega no elemento 0
		if(n==0){
			return 0;
		} else {
			if(vetor[n -1] < 0) { 
				// caso aquele elemento seja negativo, o contador será incrementado. A função é chamada para que as verificações continuem.
				int cont = 1 + negativos(vetor, n-1);
				return cont; // qtd de elementos negativos
			} else {
				return negativos(vetor, n-1); // o elemento atual é positivo, portanto, a verificação o ignora e segue para o próximo
			}
		}
	}
}
