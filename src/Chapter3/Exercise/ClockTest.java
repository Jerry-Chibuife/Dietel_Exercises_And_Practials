package Chapter3.Exercise;

import java.util.Scanner;

public class ClockTest{

	public static void main(String[] args){

		Clock time = new Clock(12, 45, 16);
		
		System.out.printf("The time is %d:%d:%d", time.getHour(), time.getMinute(), time.getSecond());
		System.out.println();

		System.out.println(time.displayTime("00:00:00"));


		
	}
}