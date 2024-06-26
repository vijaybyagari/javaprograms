package arrays;

public class Prime 
{

	public static void main(String[] args) 
	{
		Programs prog = new Programs();
		int num=1;
		System.out.println(prog.sum(num));
		
	}

}

class Programs
{
	int  sum(int  num)
	{
		if(num<=100) 
		{
			//System.out.println(num);
			return num+sum(num+1);
		}
		
		else 
			return 0;
		 
		
	}
}
