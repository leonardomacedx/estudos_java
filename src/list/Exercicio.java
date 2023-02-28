package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? "); 
		Integer n = sc.nextInt();
		System.out.println();
		
		
		
		for (int i = 0; i < n; i++) {
			Funcionario funcionario = new Funcionario();
			System.out.println((i + 1) + "º funcionário: ");
			System.out.print("ID: ");
			funcionario.setId(sc.nextInt());
			System.out.print("Nome: ");
			sc.nextLine();
			funcionario.setNome(sc.nextLine());
			System.out.print("Salário: ");
			funcionario.setSalario(sc.nextDouble());
			System.out.println();
			
			list.add(funcionario);
		}
		
		System.out.print("Insira o id do funcionário que receberá um aumento: ");
		Integer idAumento = sc.nextInt();
		
		for(Funcionario func : list) {
			if (func.getId().equals(idAumento)) {
				System.out.print("Porcentagem de aumento: ");
				Double porcentagem = sc.nextDouble();
				func.aumentoSalario(porcentagem);
				break;
			}
			
		}
			
		System.out.println();
		System.out.println("Lista dos funcionários:");
		for(Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		
		
		sc.close();
	}

}
