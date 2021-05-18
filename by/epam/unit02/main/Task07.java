package by.epam.unit02.main;

public class Task07 {
	public static void main(String[] args) {
		{// зачем тебе лишний скобочки?
			int a, b, c;
			double z, y, m = 0;
			a = 3;
			b = -2;
			c = -4;

			if (a > 0) {
				z = Math.pow(a, 2);
				System.out.println("Result for a = " + z);
			} else {
				z = Math.pow(a, 4);
				System.out.println("Result for a =" + z);
			}
			;// ?
			if (b > 0) {
				y = Math.pow(b, 2);
				System.out.println("Result for b = " + y);
			} else {
				y = Math.pow(b, 4);
				System.out.println("Result for b = " + y);
			}
			;
			if (c > 0) {
				m = Math.pow(c, 2);
				System.out.println("Result for c = " + m);
			} else {
				m = Math.pow(c, 4);
			}
			;
			System.out.println("Result for c = " + m);
		}// аккуратнее с кодом

	}
}
