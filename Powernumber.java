class Powernumber
{
   public static void main (String args[])
   {
      int number=456,sum=0,product=1;
     for(int num=1;num<=number;num++)
     
     while(num>0)
    {
       int div=num%10;
       System.out.println(div);
        num=num/10;
        sum=sum+div;
        product=product*div;
    }
     System.out.println("sum value is "+sum);
    System.out.println("product value is "+product);
    System.out.println((sum==product)?"power number":"not a power number");
   }
}