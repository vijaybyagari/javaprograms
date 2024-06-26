class library
{
  public static void main(String args[])
  {
     int days=16;
     switch(days){
     case 1,2,3,4,5 : System.out.println("fine amount is 50 paise");
                 break;
     case 6,7,8,9,10:System.out.println("fine amount is 1  rupee");
                 break;
     case 11,12,13,14,15 :System.out.println("fine amount is 5 rupees");
                    break;
     default:System.out.println("membership is cancelled");
    }
  }
}