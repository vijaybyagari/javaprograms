class primenumber
{
  public static void main(String args[])
 {
   int i=23,start=1,count=0;
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
   if(count==2)
     System.out.println(i+ " is a prime number");
   else
     System.out.println(i+" not a prime number");
 }
}