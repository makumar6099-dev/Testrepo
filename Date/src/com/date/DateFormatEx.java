package com.date;
import java.text.DateFormat;
import java.util.Date;

/*
 * There are two classes for formatting date in java: DateFormat and SimpleDateFormat.
 * The java.text.DateFormat class provides various methods to format and parse date and time in java in language independent manner. The DateFormat class is an abstract class. java.text.
 * Format is the parent class and java.text.SimpleDateFormat is the subclass of java.text.DateFormat class.
 * In java, converting date into string is called formatting and vice-versa parsing. 
 * In other words, formatting means date to string and parsing means string to date.


 */

public class DateFormatEx {

	public static void main(String[] args) {
	
    Date d=new Date();
    System.out.println(d);
    String str=DateFormat.getInstance().format(d);
    System.out.println(str);
    
    str=DateFormat.getDateInstance().format(d);
    System.out.println("dateinstance:"+str);
    str=DateFormat.getDateTimeInstance().format(d);
    System.out.println("time instance :"+str);
    str=DateFormat.getTimeInstance(DateFormat.SHORT).format(d);
    System.out.println("short:"+str);
    str=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);
    System.out.println("medimum:"+str);
	}

}
