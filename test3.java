package com.java.words;

public class test3 {
	public static String doReversal(String str)
	{
		char[] c = str.toCharArray();
		String result = "";
		StringBuffer sb =new StringBuffer();
		for (int i = c.length - 1;i >=0;i--)
		{
			if(c[i] !=' ')
			{
				sb.append(c[i]);
			}
			if(c[i] == ' ' || i == 0)
			{
				result = result + sb.reverse().toString();
				if (i != 0)
					result += " ";
				sb.delete(0,sb.length());
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(doReversal("how are you"));
	}
}
