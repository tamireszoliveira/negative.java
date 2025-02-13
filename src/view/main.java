package view;

import controller.negativeController;

public class main {
	public static void main(String[] args) {
		
		int [] vetor = {56, -9, 6, -100, 0};
		int n = vetor.length;
		negativeController neg = new negativeController();
		System.out.println("A quantidade de elementos negativos é " + neg.negativos( vetor, n));
	}
}

