class Armstrong
{
  public static void main(String args[])
  {
    int num=234,div=0,count=0,temp=num,sum=0,a=num;
    while(num>0)//234>0 23>0 2>0
   {
     count++;
     System.out.println(num+" this is num ");//234 23 2
     num=num/10;//23 2
   }
    System.out.println(count+" this is count");
    
    while(temp>0)//234>0 
   {
     div=temp%10;//4 3 2
     sum=sum+(int)Math.pow(div,count);//64 27 8
     temp=temp/10;//23 2
     }
     System.out.println("power of number value is  "+sum);
    
     System.out.println((sum==a)?+sum+"  is an armstrong number":+sum+"  not an armstrong number");
     
   
  }
   
}