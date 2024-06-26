class leapyear
{
 public static void main(String args[])
 {
   int year=1800,end=2000;
   while(year<=end)
   {
     if(year%4==0 || year%400==0 && year%100!=0)
     System.out.println(year+" it is a  leap year");
     year++;
     
   }
 }
}