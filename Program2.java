import java.util.Scanner;

class Even
  {
     public void DisplayFact(int iNo)
        { 
          int iCnt = 0;
          
          if(iNo < 0)
            {
              iNo = -iNo;
            }
          
          for (iCnt  = 1; iCnt < iNo; iCnt++)
             {
               if(iNo % iCnt == 0)
                 {
                   System.out.println(iCnt);
                 }
             }          
        }
  }

class Program2
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
