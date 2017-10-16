package pl.lodz.uni.math.javaClasses.Calculator;

public class MyThirdCalculator {
	public static void main(String[] args){
		
		
		Calculator myCalculator = new Calculator(6,7);
		
		myCalculator.add();
		myCalculator.setFirstNumber(10);
		myCalculator.setSecondNumber(12);
		myCalculator.getResult();
		
		Calculator nextGenCalculator = new Calculator();
		
		Calculator myCalculatorOne = new Calculator(6,7);
		Calculator myCalculatorTwo = new Calculator(6,7);
	}
}
