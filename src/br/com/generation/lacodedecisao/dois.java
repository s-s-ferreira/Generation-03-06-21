package br.com.generation.lacodedecisao;

import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int n1, n2, n3;
	
	System.out.println("Digite os tr�s n�meros: ");
	n1 = entrada.nextInt();
	n2 = entrada.nextInt();
	n3 = entrada.nextInt();
	
	if(n1 <= n2 && n2 <= n3) {
		System.out.println("A ordem crescente �: " + n1 + n2 + n3);
	}
	else if(n1 <= n3 && n2 <= n3) {
		System.out.println("A ordem crescente �: " + n1 + n3 + n2);
	}
	else if(n2 <= n1 && n1 <= n3) {
		System.out.println("A ordem crescente �: " + n2 + n1 + n3);
	}
	else if(n2 <= n3 && n2 <= n1) {
		System.out.println("A ordem crescente �: " + n2 + n3 + n1);
	}
	else if(n3 <= n1 && n1 <= n2) {
		System.out.println("A ordem crescente �: " + n3 + n1 + n2);
	}
	else {
		System.out.println("A ordem crescente �: " + n3 + n2 + n1);
	}

	}

}
