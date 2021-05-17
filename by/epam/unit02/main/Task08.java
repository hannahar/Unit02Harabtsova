package by.epam.unit02.main;

public class Task08 {
	public static void main(String[] args) {
		double x1, x2, x3, x4;
		double y1, y2, y3;
		double x, y;
		x = 4.1;
		y = -2;

		x1 = 4;
		x2 = 2;
		x3 = -2;
		x4 = -4;
		y1 = 4;
		y2 = 0;
		y3 = -3;
		 if ((x<= x2 && x>=x3) && (y<=y1 && y>=y2)) {
			 System.out.println(true);
		 }
		 if ((x<=x1 && x>=x4) && (y<=y2 && y>=y3)) {
			 System.out.println(true);
		 }
		 else {
			 System.out.println(false);
		 }
	
	}
}
