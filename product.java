class product
{
   public static void main(String args[])
  { 
     String name="shirt";
     int pcode=9823,price=499,quantity=6,credit=150,coupon=25;
     double total=0,dis=0,cgst=0,sgst=0,payment=0,total2=0;
     total=price*quantity;   
     total2=total;
     dis=13/100.0*price;
     cgst=9/100.0*price;
     sgst=9/100.0*price;
    payment=total2+cgst+sgst-(dis+credit+coupon);
    System.out.println("product name             "+name);
    System.out.println("product code            "+pcode);
    System.out.println("product price           "+price);
    System.out.println("product quantity     "+quantity);
    System.out.println("paying credit           "+credit);
    System.out.println("applying coupon         "+coupon);
    System.out.println("discount amount             "+dis);
    System.out.println("product total            "+total);
    System.out.println("payment amount          "+payment);

     
      
  }
}