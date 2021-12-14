import java.util.Scanner;

class FhtoCs22
  {
     public double FhtoCs(double dTemp)
      {  
        double dCelsius = 0.0;     
    
        dCelsius = ((dTemp - 32) * 0.5556);
        
        return dCelsius;

      }
   }   

class Program22
 {
   public static void main(String arg[])
     {
       double dValue = 0.0; 
       double dRet   = 0.0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       dValue = sObj.nextDouble();
       
       FhtoCs22 cObj = new FhtoCs22();
       
       dRet = cObj.FhtoCs(dValue);
       
       System.out.println(dRet);      
      

     }
 }
