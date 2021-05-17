package by.epam.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		double x, y = 0;
		double a, b;
		a = 1.7;
		b = 9;
		if (a > b) {
			x = a;
			y = b;
			System.out.println("x= " +x );
			System.out.println("y= " +y);
		}

		else if (a < b) {
			x = b;
			y = a;
			System.out.println("x= " +x);
			System.out.println("y= " +y);
		} 
		else  {
			System.out.println("Set other values to a and b, as they are equal.");
		}
		
	}

}
