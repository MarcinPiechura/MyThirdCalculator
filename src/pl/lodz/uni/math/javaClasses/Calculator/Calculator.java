package pl.lodz.uni.math.javaClasses.Calculator;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private int result;
	
	public Calculator(int firstNumber, int secondNumber) {
		// TODO Auto-generated constructor stub
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public Calculator() {
		// TODO Auto-generated constructor stub
	}


	public void add() {
		// TODO Auto-generated method stub
		this.result = this.firstNumber + this.secondNumber;
	}
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public int getResult() {
		return result;
	}
}
