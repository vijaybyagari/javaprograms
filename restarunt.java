import java.util.Scanner;
class Restarunt
{
  public static void main(String args[])
  {
     Scanner r=new Scanner(System.in);
     System.out.println("welcome to Babai Hotel");
     System.out.println("please enter your name");
     String name=r.nextLine();
     System.out.println("Enter you gender");
     String gender=r.next();
     if(gender.equals("male") || gender.equals("MALE"))
     {
       System.out.println("welcome Mr."+name);
     }
     else
     {
       System.out.println("welcome Miss/ms."+name);
     }
     System.out.println("Available menu are\n1.starters\n2.salads\n3.maincourse\n4.Desert\n5.softdrinks");
  char decision;
   int menu,quantity,sprice=300,saprice=250,mprice=600,dprice=180,softprice=40,total=0;
do
 {
    System.out.println("enter a number 1 to 5");
    menu=r.nextInt();
    if(menu==1)
    {
      System.out.println("you choosed starters\nEnter the quantity");
      quantity=r.nextInt();
      total=total+(quantity*sprice);
    }
    else if(menu==2)
    {
      System.out.println("you choosed salads\nEnter the quantity");
      quantity=r.nextInt();
      total=total+(quantity*saprice);
    }
    else if(menu==3)
    { 
       System.out.println("you choosed maincourse\nEnter the quantity");
       quantity=r.nextInt();
       total=total+(quantity*mprice);
    }
    else if(menu==4)
    {
      System.out.println("you choosed deserts\nEnter the quantity");
      quantity=r.nextInt();
      total=total+(quantity*dprice);
    }
    else if(menu==5)
    {
      System.out.println("you choosed softdrinks\nEnter the quantity");
      quantity=r.nextInt();
      total=total+(quantity*softprice);
    }
   System.out.println("Enter y to continue and n to exit");
   decision=r.next().charAt(0);
   if(decision=='n' || decision=='N')
   {
     System.out.println("total price is"+total+"\nThank you visit again");
     break;
    }
    
 }
     
    while(true); 
     
   }
}