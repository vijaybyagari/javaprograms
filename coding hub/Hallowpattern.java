package javaprograms;

public class Hallowpattern {

	public static void main(String[] args) 
	{
		for(int r=1;r<=6;r++)
		{
			for(int c=1;c<=r;c++)
			{
			if(c==1||r==6||r==c)
			 System.out.print("#");
			else
				System.out.print(" ");
			}
			System.out.println();
		 }
		   for(int r=1;r<=6;r++)
		   { 
			for(int c=6;c>=r;c--)
			    { 
				 if(c==1||r==6||r==c)
				 {	 
				 System.out.print("#");
			     }
				 else
				 {
					 System.out.print(" ");
				 }
	          }
		   }	
			
			System.out.println();
		}	
			

	}


