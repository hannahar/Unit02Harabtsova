package by.epam.unit02.main;

public class Task03 {
	public static void main (String[] args) {
		int t = 4231;
		int hour = t/3600;
		int minutes = ((t-hour*3600)/60);
		int seconds = ((t-hour*3600)-minutes*60);
		System.out.println(hour +"ч" + " " + minutes +"мин" + " " + seconds +"сек.");
	}
	
}
