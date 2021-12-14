import java.util.Scanner;

class Program1
 {

   public static void main (String arg[])
     {  
         int i = 0, j = 0, iSize = 0, iSum = 0;
         boolean iRet = false;
       //  int arr[];
       
       Scanner sObj = new Scanner(System.in);
      
      System.out.println("Enter the Number you Want");
        i = sObj.nextInt();
      
      
      Marvelous mObj = new Marvelous();
      
      mObj.PrintEven(i);
        
      }
 }
 
 class Marvelous
  {
       public void PrintEven(int iNo)
    { 
      int iCnt = 0;
      
      for(iCnt = 1; iCnt <= iNo*2; iCnt++)
        {
           if((iCnt % 2) == 0 )
             {
               System.out.println(iCnt);
             }  
         }       
    }
  } 
