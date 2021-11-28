package Chapter3.Exercise;

import java.util.Scanner;

public class ClockTest{

	public static void main(String[] args){

		Clock time = new Clock(12, 45, 16);
		
		System.out.printf("The time is %d:%d:%d", time.getHour(), time.getMinute(), time.getSecond());
		System.out.println();
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int minute = input.nextInt();
		int second = input.nextInt();
		time.setHour(hour);
		time.setMinute(minute);
		time.setSecond(second);
		
		time.getHour();
		time.getMinute();
		time.getSecond();

		
	}
}