import java.util.Scanner;

class RectArea20
  { 
     
     
     public double RectArea(double fWidth , double fHight )
      { 
         double Area = 0;
         
          Area = (fWidth * fHight); 
          return Area;       
      }
      
   }

class Program20
 {
   public static void main(String arg[])
     {
       double fValue1 = 0.0, fValue2 = 0; 
       double iRet   = 0.0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       fValue1 = sObj.nextDouble();
       
       System.out.println("Enter the Number you want");
       fValue2 = sObj.nextDouble();
       
       RectArea20 cObj = new RectArea20();
       
       iRet = cObj.RectArea(fValue1,fValue2);
       
       System.out.println(iRet);      
      

     }
 } 
