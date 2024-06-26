class Agelimit
{
   public static void main(String args[])
   {
     int limit=18;
     if(limit<=10)
     {
       System.out.println("you are kid");
     }
     else if(limit<18)
     {
      System.out.println("you are minor");
     }
     else if(limit<=50)
     {
      System.out.println("you are major");
     }
     else
     {
      System.out.println("you are senior citizen");
     }
    }
}