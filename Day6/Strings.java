package stringutils;

public class Strings
{
	public String Concatenation(String a, String b)
	{
		return a + b;
	}
	
	public String Reverse(String a)
	{
		String s = "";
		for(int i = a.length() - 1; i >= 0; i--)
		{
			s += a.charAt(i);
		}
		return s;
	}
	
	public int FindLength(String a)
	{
		return a.length();
	}
}