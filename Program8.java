import java.lang.*;
import java.util.Scanner;

class Difference8
 {
   public int DiffFact(int iNo)
     {
       int iCnt = 0;
       int iSum1 = 0;
       int iSum2 = 0;
       int iTotal = 0;
       
       if(iNo < 0)
        {
          iNo = -iNo;
        }
        for(iCnt = 1 ; iCnt < iNo; iCnt++)
          {
            if(iNo % iCnt != 0)
            {
              iSum1 = iSum1 + iCnt;
            }
            else
            {
             iSum2 = iSum2 + iCnt;
            }
          }
           iTotal = iSum2 - iSum1;
       return iTotal;   
     }  
   }

class Program7
  {
    public static void main(String arg[])
     {
       int iValue = 0, iRet = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       iValue = sObj.nextInt();
       
       Difference8 nObj = new Difference8();
       
     iRet =  nObj.DiffFact(iValue);
  
      System.out.println(iRet);
  
     }
  }
