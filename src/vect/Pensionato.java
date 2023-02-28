package vect;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de alugueis? ");
		Aluguel[] vect = new Aluguel[10];
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Aluguel #" + (i + 1) + ":");
			Aluguel aluno = new Aluguel();
			System.out.print("Nome: ");
			sc.nextLine();
			aluno.setNome(sc.nextLine());
			System.out.print("Email: ");
			aluno.setEmail(sc.next());
			System.out.print("Quarto: ");
			aluno.setQuarto(sc.nextInt());
			
			vect[aluno.getQuarto() - 1] = aluno;
			System.out.println();
		}
		
		System.out.println("Quartos alugados: ");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
