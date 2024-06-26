class Armstrong
{
  public static void main (String args[])
  {
      Arm obj=new Arm(); 
      obj.method1();
      System.out.println(obj.method2(50));
      obj.method3();

   }
}

class Arm
{
   void method1();
{
   int pow=0,sum=0;
   for(int num=1;num<=50;num++)
   {
      int temp=num,count=0,rem=0;
       rem=num%10;
      System.out.println(rem);
      num=num/10;
      count++;
   while(rem>0)
   {
      pow=(int)Math.pow(rem,count);
      System.out.println(pow);
      sum=sum+pow;
       
   }
   System.out.println((temp==sum)?"Armstrong number":"not a Armstrong number");
  
     String method2(int num);
   {
       obj.method1();
       return (temp==sum)?"Armstrong number":"not a Armstrong number";

   }
    String method3;
   {
      int num=50;
      obj.method1();
      System.out.println((temp==sum)?"armstrong number":"not an armstrong number");
   }
  
 }
}

}