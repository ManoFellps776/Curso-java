package fundamentos;

import java.util.Scanner;
/*
 * Calcular Celsius para fahrenheit ou inverso.
 */


public class Temperatura {
	public static void main(String[] args) {
		double ceusios;
		double fahrenheit;
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite o valor do Celsius: ");
		double temperaturaCeusios = scanner.nextDouble();
		fahrenheit = (temperaturaCeusios * 9 / 5.0) + 32;
		System.out.println("A temperatura de " + temperaturaCeusios + "ºC é : " + fahrenheit + " em Fahrenheit");

		System.out.println("digite o valor do Fahrenheit: ");
		double temperaturaFah = scanner.nextDouble();
		ceusios = (temperaturaFah - 32) / 1.8;

		System.out.println("A temperatura de " + temperaturaFah + "ºF é : " + ceusios + " em Celsius");

	}

}
