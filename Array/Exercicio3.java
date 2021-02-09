package Array;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 100;
		int array[][];
		array = new int[x][y];
		
		//item a:
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				array[i][j] = i-j;
			}
		}
		//item b:
		System.out.println("Subtração dos índices de cada elemento:");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		//item c:
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				array[i][j] = array[i][j] * 7;
			}
		}
		//item d:
		System.out.println("Multiplicação dos índices de cada elemento por 7:");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
	
}
