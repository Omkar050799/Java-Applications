import java.util.Scanner;

class EvenFactor3
  {
     public void DisplayFact(int iNo)
        { 
          int iCnt = 0;
          
          if(iNo < 0)
            {
              iNo = -iNo;
            }
          
          for (iCnt  = 1; iCnt < iNo/2; iCnt++)
             {
               if((iNo / iCnt == 0) && (iCnt % 2 == 0))
                 {
                   System.out.println(iCnt);
                 }
             }          
        }
  }

class Program3
  {
     public static void main(String args[])
      {
         int i = 0, j = 0, iRet = 0;
         
         Scanner sObj = new Scanner(System.in);
         
         System.out.println("Enter the Number");
         i = sObj.nextInt();
         
         Even eObj = new Even();
         
         eObj.DisplayFact(i);        
  
      }
  }
