package arrays;

public class methods {

	public static void main(String[] args) 
	{
		method1 obj=new method1();
		 obj.m1();
		 System.out.println(obj.m2(79));
         obj.m3(67);
         obj.m4(45, 93);
         System.out.println(obj.m5());
	}

}

class method1
{
  void m1()	//without return type;
{
   int x=20;
   System.out.println(x%2==0?x+" even":x+" odd");
}
 String m2(int y)//with return type single parameter;
 {
	 return y%2==0?y+" even":y+" odd";
 }
 void m3(int z)//without return type single parameter;
 {
	 System.out.println(z%2==0?z+" even":z+" odd");
 }
 void m4(int a,double b)//without return type two datatypes parameter;
 {
	 double res=a+b;
	 System.out.println(res);
 }
  String m5()
  {
	  int x=87;
	  return x%2==0?x+" even":x+" odd";
  }
}