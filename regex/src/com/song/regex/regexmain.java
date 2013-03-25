package com.song.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexmain extends StringMatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		onefun();
		System.out.println("------------1----------------------");
		twofun();
		System.out.println("------------2----------------------");
		System.out.println(isNoNumberAtBeginning("gghgh"));
		System.out.println(isIntersection("gghbgh"));
		System.out.println("-------------3---------------------");
		threefun();
		System.out.println("-------------4---------------------");
		fourfun();
		System.out.println("-------------5---------------------");
		fivefun();
		System.out.println("-------------6---------------------");
		testSimpleTrue();
	}
	
	
	
	public static void onefun(){
		String EXAMPLE_TEST = "Via and . ac or , abc the $ i<title> can </title> refer to a group. $1 is the first group, " +
				"$2 the second, etc.Lets for example assume you want to replace all whitespace " +
				"between a letter followed by a point or a comma. This would involve that the point " +
				"or the comma is part of the pattern. Still it should be included in the result ";
		
		String pattern = "a(?!b) ";
		
		System.out.println(EXAMPLE_TEST);
		System.out.println("---^^^^^^-original------");
		System.out.println(EXAMPLE_TEST.replaceAll(pattern, "---")); 
		System.out.println(EXAMPLE_TEST.matches(pattern));
		System.out.println(EXAMPLE_TEST.split(pattern));		
	}
	
	public static void twofun(){
		 final String EXAMPLE_TEST2 = "This is my small example "
			      + "string which I'm going to " + "use for pattern matching.";

		    System.out.println(EXAMPLE_TEST2.matches("\\w.*"));
		    String[] splitString = (EXAMPLE_TEST2.split("\\s+"));
		    System.out.println(splitString.length);// Should be 14
		    for (String string : splitString) {
		      System.out.println(string);
		    }
		    // Replace all whitespace with tabs
		    System.out.println(EXAMPLE_TEST2.replaceAll("\\s+", "\t"));
		
	}
	
	public static void threefun(){
		 final String EXAMPLE_TEST2 = "This is my small example "
			      + "string which I'm going to " + "use for pattern matching.";

		 Pattern pattern = Pattern.compile("\\w+");
		    // In case you would like to ignore case sensitivity you could use this
		    // statement
		    // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(EXAMPLE_TEST2);
		    // Check all occurrence
		    while (matcher.find()) {
		      System.out.print("Start index: " + matcher.start());
		      System.out.print(" End index: " + matcher.end() + " ");
		      System.out.println(matcher.group());
		    }
		    // Now create a new pattern and matcher to replace whitespace with tabs
		    Pattern replace = Pattern.compile("\\s+");
		    Matcher matcher2 = replace.matcher(EXAMPLE_TEST2);
		    System.out.println(matcher2.replaceAll("\t"));		
	}
	
	public static void fourfun(){
		    String s = "humbapumpa jim";
		    System.out.println(s.matches(".*(jim|joe).*"));
		    
		    s = "humbapumpa jom";
		    System.out.println(s.matches(".*(jim|joe).*"));
		    
		    s = "humbaPumpa joe";
		    System.out.println(s.matches(".*(jim|joe).*"));
		    
		    s = "humbapumpa joe jim";
		    System.out.println(s.matches(".*(jim|joe).*"));	
	}
	
	public static void fivefun(){
	    String pattern = "\\d\\d\\d([,\\s])?\\d\\d\\d\\d"; // ? Occurs no or one times, ? is short for {0,1} 
	    
	    String s= "1233323322";
	    System.out.println(s.matches(pattern));
	    
	    s = "1233323";
	    System.out.println(s.matches(pattern));
	    
	    s = "123 3323";
	    System.out.println(s.matches(pattern));
	}
	

	  public static void testSimpleTrue() {
	    String s= "1233";
	    System.out.println(test(s));
	    
	    s= "0";
	    System.out.println(test(s));
	    
	    s = "29 Kasdkf 2300 Kdsdf";
	    System.out.println(test(s));
	    
	    s = "99900234";
	    System.out.println(test(s));
	  }	  
	  
	  public static boolean test (String s){
	    Pattern pattern = Pattern.compile("\\d{3}");
	    Matcher matcher = pattern.matcher(s);
	    if (matcher.find()){
	      return true; 
	    } 
	    return false; 
	  }
	  
	  /*
		Finding duplicated words 
		The regular expression \b(\w+) \1\b matches duplicated words. 
		The (?!-in)\b(\w+) \1\b finds duplicate words if they do not start with "-in". 
	   */

}
