//Accept number of rows and number of columns from user and display below
//pattern.
//
// Input : iRow = 4    iCol = 4
//
//  
//  A     B     C      D
//  A     B     C      D
//  A     B     C      D
//  A     B     C      D
//////////////////////////////////////////////////////////////

import java.util.Scanner;

class Patterns
 {
     public void pattern(int iRow, int iColumn)
       {
          int i = 0, j = 0;
          char cChar1 = '\0'; 

          for (i = 1; i <= iRow ;i++)
            {
               for (j = 1, cChar1 = 'A'; j <= iColumn ;j++,cChar1++  )
                 {
                    System.out.print(cChar1+"\t");
                 }
              System.out.println("");   
            }

       }     

 }


class Program39
 {
   public static void main(String args[])
     {
         Scanner sObj = new Scanner(System.in);

         int iValue1 = 0, iValue2 = 0;

         System.out.println("Enter the Row :");
         iValue1 = sObj.nextInt();

         System.out.println("Enter the Coloumn : ");
         iValue2 = sObj.nextInt();

         Patterns pObj = new Patterns();

         pObj.pattern(iValue1,iValue2);

     }
 }


