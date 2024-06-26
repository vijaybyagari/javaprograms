class Supernumber
{
  public static void main(String args[])
 {
   int i=16,start=1,count=0;
   while(start<=i)
  {
    if(i%start==0)
    {
      count++;
      System.out.println("factors of a number "+start);
    }
    start++;
   }
   System.out.println("count of factors "+count);
   if(count==5)
     System.out.println(i+ " is super number");
   else
     System.out.println(i+" not a super number");
 }
}