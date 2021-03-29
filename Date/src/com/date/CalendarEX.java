package com.date;

import java.util.Calendar;

public class CalendarEX {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println("today date"+c.getTime());
//		c.add(Calendar.DATE, -15);
//		System.out.println("before 15 days:"+c.getTime());
//		c.add(Calendar.MONTH, 5);
//		System.out.println("after 5 months:"+c.getTime());
//		//c.isWeekDateSupported();
//		c.add(Calendar.YEAR, 25);
//		System.out.println("after 25 yeares:"+c.getTime());
//		c.add(Calendar.HOUR, 10);
//		System.out.println("after 10 hours:"+c.getTime());
//		c.add(Calendar.WEEK_OF_MONTH, 2);
//		System.out.println("week of month"+c.getTime());
		
System.out.println(c.get(Calendar.YEAR));
System.out.println(c.get(Calendar.MONTH));
int maximum= c.getMaximum(Calendar.DAY_OF_MONTH);

System.out.println(maximum);
int maximum1= c.getMaximum(Calendar.DAY_OF_WEEK);
System.out.println(maximum1);
int maximum2= c.getMaximum(Calendar.WEEK_OF_YEAR);
System.out.println(maximum2);
int z=c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
System.out.println(z);



	}

}
