package phase2.junit.gradle;

public class ArCalculator {
	
	public double divide(double dividend, double divisor) {
		if(divisor==0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return dividend / divisor;
	}
}


