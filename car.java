class car
{
  public static void main(String args[])
  {
    String carname="defender",model="hybrid hycross",modelno="21234";
    long price=4000000,appfee=2000,advfee=10000000,accessories=23000;
    double tax=0;sgst=0,cgst=0,insurence=0,onroad=0;
    tax=10/100*price;
    sgst=4/100.0*price;
    cgst=4/100,0*price;
    insurence=15/100*price;
   onroad=price+tax+sgst+cgst+insurence;
    System.out.println("show room price is       "+price);
    System.out.println("on road pricenis"+onroad);


  }
}