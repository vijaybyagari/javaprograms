 class Evilnumber
{
  public static void main(String args[])
  {
    for(int num=1;num<=100;num++)
   {
       int start=num,temp=num;
       int sq=num*num;
       System.out.println(sq);
      while(sq>0)
     {
       int rem=sq%10;//5 2 0 2
      int sum+=rem;
     // System.out.println("this is a div value"+rem);//5 2 0 2
      sq=sq/10;//202 20 2
     }
  }
   System.out.println("extract the numbers from square"+rem);
   System.out.println("this is a sum value"+sum);
  System.out.println((sum==temp)?"evil number":"not a evil number");
   
     
  }
}