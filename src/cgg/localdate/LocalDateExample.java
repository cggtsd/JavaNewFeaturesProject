package cgg.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate tfd = LocalDate.of(2014, Month.JUNE, 2);
		System.out.println("Telangana Formation Day "+tfd);
		
		System.out.println("Tomorrow's date : "+today.plusDays(1));
		System.out.println("Last Month : "+today.minusMonths(1));
		System.out.println("Is leap year? :"+today.isLeapYear());
		System.out.println("Move to 30th day of month "+today.withDayOfMonth(30));
		System.out.println("Day of year "+today.withDayOfYear(40));
	}

}
