package impl;

import java.util.ArrayList;


public class Main {
	
	//method that applies all functions over the number
	//return an array with the result
	
	public static ArrayList<Integer> calculate(Integer number, Function... functions){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(Function function : functions){
			result.add(function.calculate(number));
		}
		
		return result;
		
	}
	
	public static void print_array(ArrayList<Integer> array){
		System.out.print("[");
		for (int i = 0; i < array.size(); i++){
			if (i == array.size() - 1){
				System.out.print(array.get(i) + "]");
				break;
			}
			System.out.print(array.get(i) + ", ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//test the problem
		
		//the number used as an argument
		Integer number = 4;
		
		ArrayList<Integer> result = new ArrayList<>();
		
		//class Examples is used to store the functions used for testing
		Examples examples = new Examples();
		
		//test with two functions
		result = calculate(number, examples.add_one, examples.add_two);
		
		print_array(result);
		
		//test with five functions
		result = calculate(number, examples.add_one, examples.add_two, 
				examples.add_three, examples.multiply_by_3, 
				examples.multiply_by_5);
		
		print_array(result);
				
	}

}
