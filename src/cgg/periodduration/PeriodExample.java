package cgg.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2014, Month.JUNE, 2);
		LocalDate end = LocalDate.now();
		
		Period period = start.until(end);
		
		System.out.println("Days : "+period.get(ChronoUnit.DAYS));
		System.out.println("Months : "+period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+period.get(ChronoUnit.YEARS));
		
		System.out.println("-----------------------------------------");
		
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		int days = Period.between(initialDate, finalDate).getDays();
		System.out.println(days+" days ");

		
		System.out.println("------------------------------");
		
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between+" days ");
		
		
		System.out.println("--------------------------------");
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1945, Month.JANUARY, 26);
		Period p = Period.between(birthday, today);
		long p1 = ChronoUnit.DAYS.between(birthday, today);
		
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months, and "
		+p.getDays()+"days old.( "+ p1+ " days total)");
		
		System.out.println("---------------------------------------------");
		
		//to calculate next birthday
		
		LocalDate nextBDay = birthday.withYear(today.getYear());
		//if your birthday has occurred this year already,add 1 to the year
		if(nextBDay.isBefore(today)||nextBDay.isEqual(today)) {
			nextBDay=nextBDay.plusYears(1);
		}
		
		p=Period.between(today,nextBDay);
		p1=ChronoUnit.DAYS.between(today, nextBDay);
		System.out.println("There are "+p.getMonths()+" months, and "+
		p.getDays()+" days until your next birth day. ("+p1+" total)");
		
		
		System.out.println("---------------------------------------");
		
		LocalTime initialTime = LocalTime.of(6, 30,0);
		
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		
	    long seconds = Duration.between(initialTime, finalTime).getSeconds();
	    
	    System.out.println(seconds+" seconds");
		
	    long between2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
	    System.out.println(between2+" seconds");
		
	    System.out.println("------------------------------------");
		//Date and Time formatting
	    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	    LocalDate currentDate = LocalDate.now();
	    System.out.println(currentDate.format(formatter));
	    
	    System.out.println("--------------------------------------");
	    DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	    LocalTime currentTime = LocalTime.now();
	    System.out.println(currentTime.format(timeFormatter));
	    
	    System.out.println("--------------------------------------");
	    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    String text="12/02/2015";
	    LocalDate date = LocalDate.parse(text,formatter1);
	    System.out.println(date);
	    
	    System.out.println("------------------------------------");
	    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH-mm-ss");
	    String time="12-40-20";
	    LocalTime newTime = LocalTime.parse(time,formatter2);
	    System.out.println(newTime);
	    
	  
	    
	}

}
