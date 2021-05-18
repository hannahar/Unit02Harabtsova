package by.epam.unit02.main;

public class Task09 {
	public static void main (String[] args) {
		double x, fx = 0;// помнишь про code convention?
		x = -2;
		
		if (x <= -3 ) {
			fx = 9;			
		}
		else if (x >3){
			fx = 1/ ((Math.pow(x, 2)+1));
		}
		System.out.println("fx= " + fx);
	}

}
// Хорошо решила задачи, только аккуратнее с кодом
