package com.song.regex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class calendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contain_yesterday = "tomorrow";
		String strtem, result="write calendar tomorrow";
		Calendar calendar = Calendar.getInstance(); 
		calendar.add(Calendar.DATE, 1);  
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd yyyy", Locale.CANADA);
		strtem = dateFormat.format(calendar.getTime());
		
		result = result.toLowerCase(Locale.CANADA).replaceAll(contain_yesterday, strtem);
		System.out.println(result);
	}

}
