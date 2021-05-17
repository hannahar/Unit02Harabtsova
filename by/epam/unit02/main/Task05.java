package by.epam.unit02.main;

public class Task05 {
	public static void main (String[] args) {
		int x,y;
		double result;
				
		x = 2;
		y = 1;
		
		result = (Math.sin(x)+Math.cos(y))/(Math.cos(x)- Math.sin(y))*Math.tan((x*y));
	  				
		System.out.println(result);
	}


}
