package com.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormat2 {

	public static void main(String[] args) throws ParseException {
		
        Date d=DateFormat.getDateInstance(DateFormat.DEFAULT).parse("9 mar, 2021");
        System.out.println(d);
	}

}
