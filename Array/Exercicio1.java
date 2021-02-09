package Array;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int tam = 9;
		int array[];
		array = new int[tam];
		
		//item a:
		for(int i = 0; i < tam; i++) {
			array[i] = i;
		}
		//item b:
		System.out.println("Índice de cada elemento:");
		for(int i = 0; i < tam; i++) {
			System.out.println(array[i]);
		}
		//item c:
		for(int i = 0; i < tam; i++) {
			array[i] = i * 3;
		}
		//item d:
		System.out.println("Índice de cada elemento multiplicado por 3:");
		for(int i = 0; i < tam; i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
