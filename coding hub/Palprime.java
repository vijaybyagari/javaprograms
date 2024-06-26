package javaprograms;
import java.util.Scanner;

public class Palprime
{

	public static void main(String[] args) 
	{
		int count=0,num=11,temp=num,div=0,rem=0,y=num;
		
		while(num>0)
		{
			div=num%10;//1
			rem=rem*10+div;//11
			num=num/10;//1
		}
		System.out.println(rem);//11
             for(int i=1;i<=temp;i++)//1<=11 2<=11 3<=11
             {	 
			   if(temp%i==0)//
			   {  
			      count++;//1 2
			   }  
             }
             System.out.println(count);
		  if(count==2 && y==rem)
		  System.out.println("palindrome and prime number");
		  else
		  System.out.println("palindrome and not prime number");	 
	}
}	

		




