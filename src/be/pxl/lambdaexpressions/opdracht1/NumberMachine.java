package be.pxl.lambdaexpressions.opdracht1;

import java.util.ArrayList;

public class NumberMachine {
	private ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++)
			this.numbers.add(numbers[i]);
	}

	public String processNumbers(NumberFilter filter) {
		String result = "";
		boolean controle = false;
		for (int i = 0; i < numbers.size(); i++) {
			if (controle == true) {
				result += "-";
				controle = false;
			}

			if (filter.check(numbers.get(i))) {
				controle = true;
				result += numbers.get(i);
	
			}
		}
		return result;
	}
	public String convertNumbers(NumberConverter converter) {
		String result ="";
		for (int i = 0 ; i < numbers.size(); i++) {
			result+= converter.convert(numbers.get(i));
			if (i+1 != numbers.size()) {
				result += "-";
			}
		}
		return result;
	}
}
