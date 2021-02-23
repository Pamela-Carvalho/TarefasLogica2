package Exceptions;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {

		System.out.println("Insira um número decimal: ");
		try {
			double num = leNumero();
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
		
	}
	
	public static double leNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

}
