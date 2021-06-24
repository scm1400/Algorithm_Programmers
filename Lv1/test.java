import java.util.*;

public class test {

	public static void main(String[] args) {
		String[] a = new String[] {"/a/a_v2.x", "/b/a.x", "/c/t.z","/d/a/t.x","/e/z/t_v1.z","/k/k/k/a_v9.x"};

		TreeMap<String, Integer> map = new TreeMap<>();
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < a.length; i++)
		{
			String[] b = a[i].split("/");
			
			String filename = b[b.length-1];
			
			if(filename.contains("_"))
			{
				String temp = filename.substring(0,filename.lastIndexOf("_"));
				filename = temp + filename.substring(filename.lastIndexOf("."));
			}
			map.put(filename, map.getOrDefault(filename, 0)+1);
			//System.out.println(filename);
		}
		
		//System.out.println(map);
		
		for(String c : map.keySet())
		{
			if(map.get(c)>1)
			{
				list.add(c);
				list.add(Integer.toString((map.get(c))));
			}
		}

		System.out.println(list);

	}
}
