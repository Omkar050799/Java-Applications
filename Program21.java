import java.util.Scanner;

class KmtoMeter21
  {
     public int KmtoMeter(int iNo)
      { 
        int Meter = 0;
        if (iNo < 0)
          {
           iNo = -iNo;
          } 
            Meter = iNo * 1000;
            return Meter; 
      }
   }   

class Program21
 {
   public static void main(String arg[])
     {
       int iValue = 0; 
       int iRet   = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       iValue = sObj.nextInt();
       
       KmtoMeter21 cObj = new KmtoMeter21();
       
       iRet = cObj.KmtoMeter(iValue);
       
       System.out.println(iRet);      
      

     }
 }
