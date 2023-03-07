package polimorfismo_imposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número de contribuintes: ");
		int n = sc.nextInt();
		List<Imposto> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuiente #" + i + " data:");
			System.out.print("Fisica ou juridica (f / j): ");
			char pessoa = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (pessoa == 'f') {
				System.out.print("Gastos de saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, funcionarios));
			}

		}

		System.out.println();
		System.out.println("Impostos pagos:");
		double total = 0;
		for (Imposto pago : list) {
			System.out.println(pago.getName() + ": $ " + String.format("%.2f", pago.calculoImposto()));
			total += pago.calculoImposto();
		}
		System.out.println();
		System.out.println("Total de impostos: $ " + String.format("%.2f", total));

		sc.close();
	}
}
