import java.util.Scanner;

class ReversFact5
 {
   public void FactRev(int iNo)
     {
       int iCnt = 0;
       if(iNo < 0)
        {
          iNo = -iNo;
        }
        for(iCnt = iNo ; iCnt < iNo ;iCnt--)
          {
            if(iNo % iCnt == 0)
            {
              System.out.println(iCnt);
            }
          }
     }  
 }

class Program5
  {
    public static void main(String arg[])
     {
       int iValue = 0, iRet = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       iValue = sObj.nextInt();
       
       ReversFact5 rObj = new ReversFact5();
       
       rObj.FactRev(iValue);
  
  
     }
  }
