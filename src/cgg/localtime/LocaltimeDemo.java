package cgg.localtime;

import java.time.LocalTime;

public class LocaltimeDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("current time : "+time);
		
		LocalTime of = LocalTime.of(5, 12,30);
		System.out.println("Time : "+of);
		
		System.out.println("Next hour : "+time.plusHours(1));
		System.out.println(time.isAfter(of));
		System.out.println(time.withMinute(45));

	}

}
