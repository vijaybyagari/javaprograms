package javaprograms;

public class Twinprimes 
{

	public static void main(String[] args)
	{
       int a=11,b=13,count=0,count1=0;
       for(int i=1;i<=a;i++)
       {
    	   if(a%i==0)
    	   count++;	   
       }
       for(int i=1;i<=b;i++)
       {
    	   if(a%i==0)
    		count1++;   
       }
       if(count == count1 && (a-b==2||b-a==2))
    	System.out.println("twin primes");
       else
    	System.out.println("not a twin primes");
	}

}
