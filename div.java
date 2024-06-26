class div
{
  public static void main(String args[])
  {
    int start=1,end=100,sum=0,pro=1;
    while(start<=end)
    {
      if(start%3==0 && start%5==0)
     {
      System.out.println(start);
      sum=sum+start;
      pro=sum*pro;
     }
      start++;
    }
    System.out.println("sum of numbers  "+sum);
    System.out.println("product of numbers  "+pro);
 
          
  }
}