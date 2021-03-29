package com.date;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SimpleDateFormatEx {

	public static void main(String[] args) throws ParseException {
		//1.date to string
		//Date d=new Date();
//		SimpleDateFormat f=new SimpleDateFormat("MM/dd/yyyy");
//		String str=f.format(d);
//		System.out.println(str);
		
		//2.string to date
		
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
				Date d=f.parse("31/03/2015");
				System.out.println(d);
				
				final List<String> l=new CopyOnWriteArrayList<String>();
				l.add("null");
				l.add("abc");
				l.add("def");
				double d1=2.1000;
//				//String s=Double.toString(d1);
				//double val=2.0000;
//				double val=123.78;
//				DecimalFormat df= new DecimalFormat("000000.0000");
				//String output=
				//System.out.println(df.format(val));
				//System.out.println( output);
				//System.out.println(val);
				
				for(String str:l) {
					
					System.out.println(str);
				}
				
//				
//		Iterator<String> it=l.iterator();
//		while(it.hasNext()) {
//			l.add("gh");
//			l.remove(1);
//			
//			System.out.println(it.next());
//		}
//		

	}

}
