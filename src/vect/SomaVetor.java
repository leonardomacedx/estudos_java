package vect;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		} 
		
		double soma = 0;
		System.out.print("Valores = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + "  ");
			soma += vect[i];
		}
		
		System.out.println();
		double media = soma / vect.length;
		System.out.println("Soma = " + soma);
		System.out.printf("Média = %.2f%n", media);
		
		
		sc.close();
	}
}
