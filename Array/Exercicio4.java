package Array;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int x = 50;
		int y = 100;
		int array[][];
		array = new int[x][y];
		
		for(int i = 49; i > 0; i--) {
			for(int j = 0; j < y; j++) {
				array[i][j] = i+j;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}

	}

}
