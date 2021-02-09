package ListaEncadeada;

import java.util.LinkedList;

public class Exercicio4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(7);
		lista.add(9);
		lista.add(5);
		
		Integer max = lista.getFirst();
	
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) > max) {
				max = lista.get(i);
			}
		}
		
		System.out.println(max);
		
	}

}
