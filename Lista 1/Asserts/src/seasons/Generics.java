package seasons;

import java.util.ArrayList;

public class Generics {
	
	static final int ROWS = 5;
	static final int COLUMNS = 5;
	
	public class Tabela<T>{
		
		private ArrayList<ArrayList<T>> array;
		
		Tabela(int rows, int columns){
			
			// Fill the array with null values
			this.array = new ArrayList<ArrayList<T>>(rows);
			for (int i = 0; i < rows; i++) {
				array.add(new ArrayList<T>(columns));
				
				for (int j = 0; j < columns; j++) {
					array.get(i).add(null);
				}
			}
		}
		
		T get(int row, int column) {
			return array.get(row).get(column);
		}
		
		void set(T value, int row, int column) {
			array.get(row).set(column, value);
		}
	}
	
	public static void main(String args[]) {
		Generics generics = new Generics();
		Tabela<Integer> tabela = generics.new Tabela<Integer>(ROWS, COLUMNS);
		
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j++) {
				tabela.set(i * ROWS + j, i, j);
			}
		}
		
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j++) {
				System.out.println(tabela.get(i, j));
			}
		}
		
	}
}
