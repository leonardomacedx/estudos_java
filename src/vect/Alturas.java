package vect;

import java.util.Locale;
import java.util.Scanner;



public class Alturas {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		
		
		for (int i = 0; i < pessoas.length; i ++) {
			Pessoa pessoaNova = new Pessoa();
			System.out.printf("Dados da %dª pessoa: %n", i + 1);
			System.out.printf("Nome: ");
			pessoaNova.nome = sc.next();
			System.out.printf("Idade: ");
			pessoaNova.idade = sc.nextInt();
			System.out.printf("Altura: ");
			pessoaNova.altura = sc.nextDouble();
			
			pessoas[i] = pessoaNova;
		}
		
		
		double menos16 = 0;
		double somaAltura = 0;
		for (int i = 0; i < pessoas.length; i++) {
			somaAltura += pessoas[i].altura;
			if (pessoas[i].idade < 16) {
				menos16++;
			}
		}
		
		double avg = somaAltura / pessoas.length;
		System.out.printf("Altura média: %.2f%n", avg);
		
		
		double percentage = (menos16 / pessoas.length) * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentage);
		
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].idade < 16) {
				System.out.printf("%s%n", pessoas[i].nome);
			}
		}
		
		
		sc.close();
	}

}
