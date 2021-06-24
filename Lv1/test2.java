
import java.util.HashMap;


public class test2 {


	
	public static void main(String[] args) {
		
		String[][] input = new String[][]
		{	
			{"BOOL","BOOL"}
			,{"BOOL","SHORT"}
			,{"BOOL","FLOAT"}
			,{"BOOL","SHORT","FLOAT"}
			,{"BOOL","INT"}
			,{"SHORT","BOOL"}
			,{"FLOAT","SHORT"}
			,{"INT","SHORT","FLOAT","INT","BOOL"}
			,{"FLOAT","SHORT","BOOL","BOOL","BOOL","INT"}
			,{"BOOL","LONG","SHORT","LONG","BOOL","LONG","BOOL","LONG","SHORT","LONG","LONG"}
		};		

		for(int i = 0; i < input.length; i++)
		{
			System.out.println(String.join(",",malloc(input[i])));
		}

	}
	public static String[] malloc(String[] a)
	{
		HashMap<String,Integer> map = new HashMap<>();
		map.put("BOOL", 1);
		map.put("SHORT", 2);
		map.put("FLOAT", 4);
		map.put("INT", 8);
		map.put("LONG", 16);
		
		String memory = "#";
		String padding = ".";
		
		String mystring = "";
		
		for(String s : a)
		{
			int n = map.get(s);
			int length = mystring.length();

			if(length % 8 == 0)
			{
				mystring += memory.repeat(n);
			}
			else
			{
				if(n - length % 8 > 0)
				{
					mystring += padding.repeat( n - length % 8 ) + memory.repeat(n);
				}
				else
				{
					mystring += memory.repeat(n);
				}
			}
		}
				
		if(mystring.length() % 8 != 0)
		{
			mystring += padding.repeat( 8 - mystring.length() % 8 );
		}
		
		String[] answer = mystring.split("(?<=\\G.{"+8+"})");
		
		if(mystring.length() > 128) 
		{
			return new String[] {"HALT"};
		}
		else
		{
			return answer;
		}
	}
}
