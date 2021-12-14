import java.util.Scanner;

class Multi4
 {
   public int MultFact(int iNo)
      {
        int iCnt = 0;
        int iMult  = 1;
        if(iNo < 0)
          {
            iNo = -iNo;
          }
        for(iCnt =1; iCnt < iNo; iCnt++)
          {
            if(iNo % iCnt == 0)
              {  
                iMult = iMult * iCnt;
                //System.out.println(iCnt);
              }
          } 
          return iMult;
      }
 }
class Program4
  {
    public static void main(String args[])
      {
        int iValue = 0, j = 0, iRet = 0;
        
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        iValue = sObj.nextInt();
        
        Multi4 mObj = new Multi4();
        
        iRet = mObj.MultFact(iValue);
        
        System.out.println(iRet);
  
      }
  } 
