package javaprograms;

public class Palindrome {

	public static void main(String[] args)
	{
	  int num=123,div=0,temp=num,rem=0;
	  while(num>0)
	  {
		  div=num%10;
		  System.out.println(div);
		  num=num/10;
		  rem=rem*10+div;
	 }
	  System.out.println(rem); 
     System.out.println((rem==temp)?"palindrome":"not a palindrome");
	}

}
