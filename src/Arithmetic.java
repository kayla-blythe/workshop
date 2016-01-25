
public class Arithmetic {

	public static void main(String[] args) {

	int operand1, operand2;
	operand1 = 25;
	operand2 = 6;
	
	int sum, difference, product, quotient, remainder;
	sum = 0;
	difference = 0;
	product = 0;
	quotient = 0;
	remainder = 0;
	
	sum = operand1 + operand2;
	difference = operand1- operand2;
	product = operand1 * operand2;
	quotient = operand1 / operand2;
	remainder = operand1 % operand2;
	
	System.out.println("          Arithmetic          ");
	System.out.println("==============================");
	System.out.println(operand1 + " + " + operand2 + " = " + sum);
	System.out.println(operand1 + " - " + operand2 + " = " + difference);
	System.out.println(operand1 + " * " + operand2 + " = " + product);
	System.out.println(operand1 + " / " + operand2 + " = " + quotient);
	System.out.println(operand1 + " % " + operand2 + " = " + remainder);

	}

}
