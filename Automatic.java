class Automatic
{
  public static void main (String args[])
  {
     int num=76,sr=0,x=num,div=0;
     if(num>0)
     {
        sr=num*num;
     }
     System.out.println(sr);
     if(sr>0)
    {
      div=sr%100;
      System.out.println("this is div value"+div);
      sr=sr/10;
      System.out.println("this is div value"+sr);

     }
           
    System.out.println((div==x)?"automatic number":"not an automatic number");
   }
}