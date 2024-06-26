class fizz_buzz
{
  public static void main(String args[])
  {
     int num=23;
    if(num%5==0  &&  num%7==0)
    System.out.println("FIZZ BUZZ");
    else if (num%3==0)
    System.out.println("fizz");
    else if (num%5==0)
    System.out.println("buzz");
    else
    System.out.println("number is not divisable by 5 and 7");
  }
}