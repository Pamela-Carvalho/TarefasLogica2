package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.push("P�mela");
		fila.push("Vict�ria");
		
		System.out.println(fila);
		
		String x1 = fila.pop();
		
		System.out.println(x1);
		System.out.println(fila);
		
		Queue<String> filaDoJava = new LinkedList<String>();
		
		filaDoJava.add("Ol�via");
		String x2 = filaDoJava.poll();
		
		System.out.println(x2);
		
	}

}
