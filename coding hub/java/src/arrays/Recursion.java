package arrays;

public class Recursion {

	public static void main(String[] args)
	{
		Rec obj=new Rec();
		 obj.add();

	}

}
 class Rec
 {
	 void add()
	 {
		 int sum=0;
		 for(int x=0;x<=100;x++)
		 {
			 if(x%2==0)
			  sum+=x;
		 }
		 System.out.println(sum);
	}
	 
 }
