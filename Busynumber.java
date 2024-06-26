class Busynumber
{
   public static void main(String args[])
  {
     int num=789,div=0,rem=0,x=num;
      div=num%10;
     System.out.println(div);
   if(div==7)
  {
   System.out.println("The number is busy");
   }
   else if(x%7==0)
   { 
   System.out.println("the number is a busy number");
   }
   else
  {
   System.out.println("number is not a busy number");
    }      
  
 }
   
}