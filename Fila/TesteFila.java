package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.push("Pâmela");
		fila.push("Victória");
		
		System.out.println(fila);
		
		String x1 = fila.pop();
		
		System.out.println(x1);
		System.out.println(fila);
		
		Queue<String> filaDoJava = new LinkedList<String>();
		
		filaDoJava.add("Olívia");
		String x2 = filaDoJava.poll();
		
		System.out.println(x2);
		
	}

}
