package Regular_expression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Start_and_end_method {
	
	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT = "cat cat cat cattie cat";
	
	public static void main(String args[])
	{
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		
		int count = 0;
		
		while(m.find())
		{
			count++;
			System.out.println("Match number " +count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " +m.end());
		}
	}
}
