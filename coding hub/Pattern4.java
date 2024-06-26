package javaprograms;

public class Pattern4 {

	public static void main(String[] args)
	{
       for(int r=1;r<=6;r++)
       {
    	   for(int c=6;c>=r;c--)
    	   {
    		  System.out.print("$ ");
    	   } 
    	   for(int c=1;c<=r;c++)
    	   {
    		  System.out.print("# "); 
    	   }
    	   System.out.println();
       }	   
	}

}
