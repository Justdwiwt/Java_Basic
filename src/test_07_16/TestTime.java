package test_07_16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TestTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date1 = LocalDate.of(2016, 7, 16);
		System.out.println(date1);

		System.out.println(date.getDayOfWeek());

		System.out.println(date1.isAfter(LocalDate.now()));

		System.out.println(date1.isLeapYear());

		System.out.println(date.plus(3, ChronoUnit.DAYS));
		System.out.println(date.minus(3, ChronoUnit.MONTHS));
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}
