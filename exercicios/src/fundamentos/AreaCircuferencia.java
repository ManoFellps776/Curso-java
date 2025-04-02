package fundamentos;

import java.util.Scanner;

public class AreaCircuferencia {
	public static void main(String[] args) {
		// variaveis
		final double pi = 3.14159;
		double raio = 3.4;
		double area = pi * raio * raio;
		System.out.println("Calculo em Java.");
		System.out.println("Mostrando a variavel :");
		System.out.println(raio + " * " + pi + " = " + area);
		System.out.println("Sem mostrar variavel :");
		System.out.println("3,4 * 3,14159 = " + area);

		raio = 10;

		area = pi * raio * raio;
		System.out.println("Raio de tamanho 10 :");
		System.out.println(raio + " * " + pi + " = " + area);
		}

}
