package Chapter3.Exercise;// 3.14 (Clock Class) Create a class called Clock that includes three instance variables
//—an hour (type int), a minute (type int) and a second (type int). 
//Provide a constructor that initializes the three instance variables and 
//assumes that the values provided are correct. Provide a set and a get method for each instance variable. 
//The set method should set the value of all three variables to 0 if the value of hour is more than 23, 
//the value of minute is more than 59, and the value of second is more than 59. 
//Provide a method displayTime that display the time in an "hh:mm:ss" format.
//Write a test app named ClockTest that demonstrates class Clock's capabilities. 



public class Clock {
 
	private int hour;
	private int minute;
	private int second;

	public Clock(int theHour, int theMinute, int theSecond){
		hour = theHour;
		minute = theMinute;
		second = theSecond;
	}


	public void setHour(int hourHand){
		hour = hourHand;
		if(hourHand > 23)
			hour = 0;
	}

	public void setMinute(int minuteHand){
		minute = minuteHand;
		if(minuteHand > 59)
			minute = 0;

	}

	public void setSecond(int secondHand){
		second = secondHand;
		if(secondHand > 59)
			second = 0;
	}


	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}


	

	public String displayTime(String displayTime){
		return displayTime;
	}

	
}