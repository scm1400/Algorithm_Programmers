import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution 
{
	public int solution(String s) 
	{
		int min = 1;

		for (int i = 1; i < s.length(); i++) 
		{
			StringBuilder result = new StringBuilder();
			Pattern p = Pattern.compile("(\\w){" + i + "}");
			Matcher m = p.matcher(s);

			String remainder = s.substring(s.length() - s.length() % i);

			String temp = "";
			int answer = 0;
			while (m.find()) 
			{
				if (m.group().equals(temp)) 
				{
					answer++;
				} else 
				{
					if (answer > 0) 
					{
						result.append(answer + 1);
						result.append(temp);
						answer = 0;
					} else 
					{
						result.append(temp);
					}
				}
				temp = m.group();
			}
			if (m.hitEnd()) 
			{
				if (answer > 0) 
				{
					result.append(answer + 1);
					result.append(temp);
					answer = 0;
				} 
				else 
				{
					result.append(temp);
				}
				result.append(remainder);
			}

			if (min == 1) 
			{
				min = result.length();
			} 
			else if (result.length() <= min) 
			{
				min = result.length();
			}

			// System.out.println(result);
		}

		return min;
	}
}