package be.pxl.lambdaexpressions.opdracht1;

public class NumberSelector {

	private NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		return numberMachine.processNumbers(new NumberFilter() {

			@Override
			public boolean check(int integer) {
				if (integer % 2 == 0) {
					return true;
				}
				;
				return false;
			}

		});

	}

	/*public String showEvenNumbersLambda() {
		return numberMachine.processNumbers(n -> (n % 2 == 0));
	}
	*/

	public String showNumbersAbove(int getal) {
		return numberMachine.processNumbers(number -> number > getal);
	}
	public String printHexNumbers() {
		return numberMachine.convertNumbers((int number) -> Integer.toHexString(number));
	}
}

