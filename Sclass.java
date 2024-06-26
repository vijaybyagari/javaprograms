import java.util.Scanner;
class Sclass
{

public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Please enter a digit");
   int a=sc.nextInt();
System.out.println("This is user enterd value : "+a);
System.out.println("Please enter a Name:");

  String str=sc.next();
System.out.println("My Name: "+str);
System.out.println("Please enter a char: ");
 char c=sc.next().charAt(0);
System.out.println(c+" "+str);

System.out.println("Please enter a Double value: ");
double d=sc.nextDouble();
System.out.println("Price : "+ d);
}

}