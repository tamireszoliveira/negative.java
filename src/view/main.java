package view;

import controller.negativeController;

public class main {
	/*4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N
	posições, passado como parâmetro:
	O código deve trazer como comentários:
	A condição de parada
	Como escrever a função para o termo n em função do termo anterior*/
	
	public static void main(String[] args) {
		
		int [] vetor = {56, -9, 6, -100, 0};
		int n = vetor.length;
		negativeController neg = new negativeController();
		System.out.println("A quantidade de elementos negativos é " + neg.negativos( vetor, n));
	}
}

