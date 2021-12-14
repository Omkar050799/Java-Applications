import java.util.Scanner;

class CircleArea19
  { 
     
     
     public double CircleArea(double fNo)
      { 
         double PI = 3.14;
         double Area = 0;
         
          Area = (PI * (fNo * fNo)); 
          return Area;       
      }
      
   }

class Program19
 {
   public static void main(String arg[])
     {
       double fValue = 0.0; 
       double iRet   = 0.0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       fValue = sObj.nextDouble();
       
       CircleArea19 cObj = new CircleArea19();
       
       iRet = cObj.CircleArea(fValue);
       
       System.out.println(iRet);      
      

     }
 } 
