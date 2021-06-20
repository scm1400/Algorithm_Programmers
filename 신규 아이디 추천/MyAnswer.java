class Solution {
    public String solution(String new_id) {
         String id = "";
        
        new_id = new_id.toLowerCase();
        
        
		for(int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);

			if(ch >= 'a' && ch <= 'z') {
				id += String.valueOf(ch);
			} else if(ch >= '0' && ch <= '9') {
				id += String.valueOf(ch);
			} else if(ch == '.' || ch == '-' || ch == '_') {
				id += String.valueOf(ch);
			}
		}
        
        while(true)
        {
        	if(id.contains(".."))
        	{
        		id = id.replace("..", ".");   	
            }
            else
            {
                break;
            }
        }
        if(id.startsWith("."))
    	{
       		id = id.substring(1);
       	}
       	else if(id.endsWith("."))
       	{
       		id = id.substring(0, id.length()-1);
       	}

        
        if(id.length()==0)
        {
        	id += "a";
        }
        
        if(id.length() >= 16)
        {
        	id = id.substring(0, 15);

        }
        
            if(id.endsWith("."))
        	{
       	    	id = id.substring(0, id.length()-1);
       	    }
        
        if(id.length() <=2)
        {
            char lastchar = id.charAt(id.length()-1);
        	for(int j = 0; j < (4-id.length()); j++)
        	{
        		id += lastchar;
        	}
        }
        return id;
    }
}