package Regular_expression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lookingat_method {
	private static final String REGEX = "foo";
	private static final String INPUT = "fooooooooooooooooo";
	private static Pattern pattern;
	private static Matcher matcher;
	
	public static void main(String[] args)
	{
		pattern = Pattern.compile(REGEX);
		matcher = pattern.matcher(INPUT);
		
		System.out.println("Current REGEX is:" +REGEX);
		System.out.println("Current INPUT is:" +INPUT);
		
		System.out.println("lookingAt(): "+matcher.lookingAt());
		System.out.println("matcher(): "+matcher.matches());
	}
}
