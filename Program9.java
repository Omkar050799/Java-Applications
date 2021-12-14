import java.util.Scanner;

class DispalyRev
  {
     public void DisplayDigit(int iNo)
      { int iDigit = 0 ;
      
         if (iNo < 0)
           {
             iNo = -iNo;
           }
           while(iNo != 0)
            {
              iDigit = iNo % 10;
              System.out.println(iDigit);
              iNo = iNo / 10;
            }
      } 
  }

class Program9
 {
   public static void main(String arg[])
     {
       int iValue = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the number you want to reverse");
       iValue = sObj.nextInt();
       
       DispalyRev dObj = new DispalyRev();
       
       dObj.DisplayDigit(iValue);
      	  
     }
 }
