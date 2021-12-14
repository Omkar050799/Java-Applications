import java.util.Scanner;

class CountRange16
  {
     public int CountRange(int iNo)
      { int iDigit = 0 ;
        int iCnt = 0;
        
        if(iNo < 0)
         {
          iNo = -iNo;
         }
         while (iNo != 0)
          {
            iDigit = iNo % 10;
             if ((iDigit > 3 ) && (iDigit < 7))
               {
                 iCnt++;
               }
            iNo = iNo / 10;
          }
        return iCnt;  
      } 
  }

class Program16
 {
   public static void main(String arg[])
     {
       int iValue = 0; 
       int iRet   = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       iValue = sObj.nextInt();
       
       CountRange16 cObj = new CountRange16();
       iRet = cObj.CountRange(iValue);
       
       System.out.println(iRet);      
      

     }
 }
