class Sumeven
{
  public static void main(String args[])
 {
   int num=9853,sum=0,pro=1,rem=0;
   while(num>0)
{
   rem=num%10;//6 5 2 3
  // System.out.println(rem);//6 5 2 3
   num=num/10;//325 32 3
   if(rem%2==0)
  {
    sum=sum+rem;
    System.out.println(rem+"  is even");
  }
  else
  {
     pro=pro*rem;
    System.out.println(rem+"  is odd");
   }
  
}
 System.out.println(sum+"    sum of even numbers");
   System.out.println(pro+"  product of odd numbers");
  
  
   
  

  }
}