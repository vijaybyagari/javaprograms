 class Evilnumber
{
  public static void main(String args[])
  {
     int sum=0,rem=0,sq=0,start=num,temp=num;
    for(int num=1;num<=10;num++)
    {
       
        sq=start*start;
       
    while(sq>0)
    {
      rem=sq%10;
      sum=sum+rem;
      sq=sq/10;
      
    }
  
   System.out.println((sum==temp)?temp+"evil number":temp+"not evil number");
   }
     
  }
}