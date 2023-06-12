package cgg.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		ZonedDateTime currTime = ZonedDateTime.now();
		ZonedDateTime zoneTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Time in India : "+currTime);
		System.out.println("Time in Paris : "+zoneTime);
		
		ZonedDateTime americaTime = ZonedDateTime.of(2023, 05,12,4,30,20,23456,ZoneId.of("America/Chicago"));
		System.out.println("Time in America : "+americaTime);

	}

}
