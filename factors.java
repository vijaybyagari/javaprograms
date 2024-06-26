class factors
{
 public static void main(String args[])
 {
   int a=88,start=1;
   while(start<=a)
   {
     if(a%start==0 && start%2==0)
    {
     
     System.out.println("factors of"+a+ "="+start);
     
     }
     start++;
   }
   
 }
}