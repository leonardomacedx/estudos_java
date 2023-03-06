package herancaFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> func = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y / n)? ");
			char outsourced = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				Employee tercerizado = new OutsourcedEmployee(name, hours, valuePerHour, addCharge);
				func.add(tercerizado);

			} else {
				Employee funcionario = new Employee(name, hours, valuePerHour);
				func.add(funcionario);
			}
		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee fim : func) {
			System.out.println(fim.getName() + " - $ " + String.format("%.2f", fim.payment()));
		}

		sc.close();
	}
}
