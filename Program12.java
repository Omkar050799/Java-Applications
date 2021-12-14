import java.util.Scanner;

class CountFour12
  {
     public int CountFour(int iNo)
      { int iDigit = 0 ;
        int iCnt = 0;
        
        
      
         if (iNo < 0)
           {
             iNo = -iNo;
           }
           while(iNo != 0)
            {
              iDigit = iNo % 10;
               
              // System.out.print(iDigit);
                if(iDigit == 4)
                 {
                   iCnt++;         
                 }
              iNo = iNo / 10;
             }
         return iCnt;    
      } 
  }

class Program12
 {
   public static void main(String arg[])
     {
       int iValue = 0; 
       int iRet   = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the number you want");
       iValue = sObj.nextInt();
       
       CountFour12 cObj = new CountFour12();
       
       iRet = cObj.CountFour(iValue);
              System.out.println(iRet);
     }
 }
