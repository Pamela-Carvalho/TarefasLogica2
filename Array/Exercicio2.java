package Array;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int tam = 10;
		int array[];
		array = new int[tam];
		
		System.out.println("Índice de cada elemento em ordem inversa:");
		for(int i = 9; i >= 0 ; i--) {
			array[i] = i;
			System.out.println(array[i]);
		}

		System.out.println("\nÍndice de cada elemento:");
		for(int i = 0; i < tam; i++) {
			System.out.println(array[i]);
		}

	}

}
