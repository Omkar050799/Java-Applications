import java.lang.*;
import java.util.Scanner;

class SumNon7
 {
   public void SumNonFact(int iNo)
     {
       int iCnt = 0;
       int iSum = 0;
       if(iNo < 0)
        {
          iNo = -iNo;
        }
        for(iCnt = 1 ; iCnt < iNo; iCnt++)
          {
            if(iNo % iCnt != 0)
            {
              iSum = iSum + iCnt;
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
       
       SumNon7 nObj = new SumNon7();
       
       nObj.SumNonFact(iValue);
  
  
     }
  }
