package my.les.on.vw;

import java.util.Scanner;

public class Met_03 {
	////

	public static void main(String[] args) {

		double x;
		double y;
		x = inputDoubleFromConsole("Input X: ");
		y = function(x);

		simplePrint(x, y);
		richPrint(x, y);

	}
	

	@SuppressWarnings("resource")
	public static double inputDoubleFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Not correct " + message);
		}
		value = sc.nextDouble();
		return value;
	}
	
	public static double function(double a) {
		double y;
		y = Math.sqrt(Math.pow(Math.E, 2.2 * a)) - Math.abs(Math.sin((Math.PI * a) / (a + 2.0 / 3.0))) + 1.7;
		return y;
	}
	
	public static void simplePrint(double a, double y) {
		System.out.println("if x = " + a + ", y = " + y);
	}
	
	public static void richPrint(double a, double y) {
		System.out.printf("[if x = %.2f] - [y = %.2f]", a, y);
	}

	///
}
