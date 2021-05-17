package by.epam.unit02.main;

public class Task04 {
	public static void main (String[] args) {
		double x1 = 0, y1 = 0;
		double x2 = 0, y2 = 0;
		double distance;
		x1 = 1;
		y1 = 2;
		x2 = -1;
		y2 = -1;
				
		distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
				
		System.out.println("distance = " +distance);
		
	
	}

}
