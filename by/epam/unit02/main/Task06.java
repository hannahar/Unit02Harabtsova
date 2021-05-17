package by.epam.unit02.main;

public class Task06 {
	public static void main (String[] args) {
int m, n;
		m =6589;
		n=6;
		double z;
		z = (double) m/n;
		//System.out.println(z);
		int y; // выделение целой части
		y = (int) z;
		//System.out.println("y= " +y);
		double x; 
		x = z -y; // определение дробной части
		//System.out.println("x= " +x);
		double a;
		a = x * 10; // выделение старшой цифры дробной части
		//System.out.println(a);
		int s;
		s = (int)a;
		System.out.println("Старшая часть дробной части равна " +s);
		double w; //определение младшой цифры дробной части
		w = y*0.1;
		//System.out.println(w);
		int r;
		r = (int)w;
		//System.out.println(r);
		double q;
		q =  w-r;
		//System.out.println(q);
		double t;
		t = q*10;
		//System.out.println(t);
		int i;
		i = (int) t;		
		System.out.println("Младшая часть целой части равна " +i);
	}		
		}


