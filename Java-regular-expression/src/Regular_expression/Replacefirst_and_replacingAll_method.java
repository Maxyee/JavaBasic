package Regular_expression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Replacefirst_and_replacingAll_method {
	private static String REGEX = "dog";
	private static String INPUT = "The dog says meow. " + "All dogs say meow";
	private static String REPLACE = "cat";
	
	public static void main(String args[])
	{
		Pattern p = Pattern.compile(REGEX);
		
		Matcher m = p.matcher(INPUT);
		INPUT = m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}
}
