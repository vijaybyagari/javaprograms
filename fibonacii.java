class fibonacii
{
  public static void main(String args[])
 {
    int num1=0,num2=1,num3=0,num=10,start;
    System.out.println(num1);
    System.out.println(num2);
    for(start=2;start<=num;++start)//2<10 3<10
   {
      num3=num1+num2;//1 
      System.out.println(" "+num3);//1
      num1=num2;
      num2=num3;
     

     }
     
  }
      
}