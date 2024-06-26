package javaprograms;
import java.util.Scanner;

public class Armstrong
    {
      public static void main(String[] args)
	{
    	  Scanner s=new Scanner(System.in);
    	 System.out.println("enter a start range");
    	  int number=s.nextInt();
    	  System.out.println("enter end range");
    	  int end =s.nextInt();
    	  int div=0,count=0,sum=0,x=number,y=number;
  		for(int num=number;num<=end;num++)
  		{
  			div=num%10;
  			System.out.println("extraction of num "+div);
  			count++;
  			
  		}
  		System.out.println("count is"+count);
  		while(x>0)
  		{
  			int rem=x%10;
  			System.out.println(x);
  			sum=sum+(int)Math.pow(rem,count);
  			
  		}
  		System.out.println("adding of numbers"+sum);
  		System.out.println((y==sum)?"is an armstrong number":"not an armstrong number");
   }

	
	}  
 
		

