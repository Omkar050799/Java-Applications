import java.util.Scanner;

class SquareMeter23
  {
     public double SquareMeter(double dTemp)
      {  
         double Meter = 0;
        if (dTemp < 0)
          {
           dTemp = -dTemp;
          } 
            Meter = dTemp * 0.0929;
            return Meter; 

      }
   }   

class Program23
 {
   public static void main(String arg[])
     {
       double dValue = 0.0; 
       double dRet   = 0.0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       dValue = sObj.nextDouble();
       
       SquareMeter23 cObj = new SquareMeter23();
       
       dRet = cObj.SquareMeter (dValue);
       
       System.out.println(dRet);      
      

     }
 }
