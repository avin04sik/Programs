package javaprograms;

public class SpaceCount {
    
    static int i,c=0,res;
    
    
    static int spacecount(String s)
    {
        for(i=0,c=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            c++;
        }
        return c;
    }
    
    public static void main (String args[])
    {
        res=SpaceCount.spacecount("i am adult");
        //string is always passed in double quotes
        
        System.out.println("The number of white spaces  in the String are :  "+res);
        
        
        

String testString="My name is Avineesh kumar";
res=SpaceCount.spaceCount2(testString);

System.out.println("The number of white spaces  in the String are :  "+res);
    
}

	/**
	 * @param testString
	 * @return 
	 */
	private static int spaceCount2(String testString) {
		char[] testChar;
		
		testChar=testString.toCharArray();
		
		int c=0;
		
		for(int i=0;i<testChar.length;i++){
		  if(testChar[i]==' ')
		   c++;
		}
		
		return c;
	}
}