import java.lang.*;
import java.util.Scanner;

class Non6
 {
   public void NonFact(int iNo)
     {
       int iCnt = 0;
       if(iNo < 0)
        {
          iNo = -iNo;
        }
        for(iCnt = 1 ; iCnt < iNo; iCnt++)
          {
            if(iNo % iCnt != 0)
            {
              System.out.println(iCnt);
            }
          }
     }  
   }

class Program6
  {
    public static void main(String arg[])
     {
       int iValue = 0, iRet = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       iValue = sObj.nextInt();
       
       Non6 nObj = new Non6();
       
       nObj.NonFact(iValue);
  
  
     }
  }
