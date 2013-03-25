package com.song.regex;
 //gg
public class StringMatcher {
	// Returns true if the string matches exactly "true"
	  public static boolean isTrue(String s){
	    return s.matches("true");
	  }
	  // Returns true if the string matches exactly "true" or "True"
	  public static boolean isTrueVersion2(String s){
	    return s.matches("[tT]rue");
	  }
	  
	  // Returns true if the string matches exactly "true" or "True"
	  // or "yes" or "Yes"
	  public static boolean isTrueOrYes(String s){
	    return s.matches("[tT]rue|[yY]es");
	  }
	  
	  // Returns true if the string contains exactly "true"
	  public static boolean containsTrue(String s){
	    return s.matches(".*true.*");
	  }
	  

	  // Returns true if the string contains of three letters
	  public static boolean isThreeLetters(String s){
	    return s.matches("[a-zA-Z]{3}");
	    // Simpler from for
//	    return s.matches("[a-Z][a-Z][a-Z]");
	  }

	  // Returns true if the string does not have a number at the beginning
	  public static boolean isNoNumberAtBeginning(String s){
	    return s.matches("^[^\\d].*");//first ^ is beginning of line. 
	                                 // second ^ is that it negates
	  }
	  // Returns true if the string contains a arbitrary number of characters except b
	  public static boolean isIntersection(String s){
	    return s.matches("([\\w&&[^b]])*");
	  }
	  // Returns true if the string contains a number less then 300
	  public static boolean isLessThenThreeHundret(String s){
	    return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
	  }

}
