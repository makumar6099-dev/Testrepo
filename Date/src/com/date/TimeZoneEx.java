package com.date;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneEx {

	public static void main(String[] args) {
//		String id[]= TimeZone.getAvailableIDs();
//		for(int i=0; i<id.length; i++) {
//			System.out.println(id[i]);
		//}
		
		//offset valu
		TimeZone zone = TimeZone.getTimeZone("Asia/Dubai");
		System.out.println(zone.getOffset(Calendar.ZONE_OFFSET));
		
		System.out.println(zone.getID());
		TimeZone zone1=TimeZone.getDefault();
	String str=	zone1.getDisplayName();
	System.out.println(str);

	}

}
