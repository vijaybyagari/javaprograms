class Perfect_square
{
  public static void main(String args[])
  {
    int num=80,num2=0;
    int num1=(int)Math.sqrt(num);
    System.out.println(num1);
    num2=num1*num1;
    if(num2==num)
    System.out.println("it is a perfect square");
    else
    System.out.println("it is not a perfect square");   
  }
}