class Armstrong
{
  public static void main (String args[])
  {
      Arm obj=new Arm(); 
      obj.method1();
     // System.out.println(obj.method2(50));
      //obj.method3();

   }
}

class Arm
{
  static void method1()
{
    
        for (int num=1;num<=100;num++) 
          {
            int sum=0,count=0,temp=num;
            for (int n1=temp;n1>0;n1/=10)
            {
             count++;
            }
            for (int n2=temp;n2>0;n2/=10) 
            {
                int last=n2%10;
                sum=sum+(int)(Math.pow(last,count));
            }
            if (sum==temp) 
            {
                System.out.println(temp+" is armstrong number");
            }

       }
    }
  }
    // String method2(int num)
  // {
  //     obj.method1();
     //  return (temp==sum)?"Armstrong number":"not a Armstrong number";

   //}
   // String method3;
   //{
     // int num=50;
     // obj.method1();
      //System.out.println((temp==sum)?"armstrong number":"not an armstrong number");
  // }
  
// }
//}

//}