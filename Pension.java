class Pension
{
    public static void main(String args[])
 {
    int age=31;
    char gender='m';
    String dep="not gov emp";
    if(age>=60 && dep=="gov emp")
    System.out.println("The pension is 25,000");
    else if(age>=60 && dep=="not gov emp")
    System.out.println("The pension is 7,000");
    else if(age<60 && age<40)
    System.out.println("The pension is 5,000");
    else if(age<=40 && gender=='f')
    System.out.println("The pension is 3,000");
    else if(age<=40 && gender=='m')
     System.out.println("The pension is 2,000");
   
    
    
  }
}