//Accept number of rows and number of columns from user and display below
//pattern.
//
// Input : iRow = 4    iCol = 4
//                           
//                          ___1_____ 2______3_____4____
//
//  1  2  3  4           1 |  (11)   (12)   (13)  (14)        
//  1  *  *  4           2 |  (21)   (22)   (23)  (24)       
//  1  *  *  4           3 |  (31)   (32)   (33)  (34)     
//  1  2  3  4           4 |  (41)   (42)   (43)  (44)                   
//
//////////////////////////////////////////////////////////////

import java.util.Scanner;

class Patterns
 {

   public void Pattern(int iRow, int iColumn)
    {
      int i = 1, j = 1;
       int Start = i;

        for(i = 1; i <= iRow; i++ )
           {
             for (j=1; j <= iRow; j++ )
               {
                  if((i > Start && i < iRow) && (j > Start && j < iColumn))
                   {
                    System.out.print("*\t");
                   }
                  else
                   {
                    System.out.print(j+"\t");
                   } 

               }
             System.out.println("");  
           }
    }
 }

class Program48
 {
   public static void main(String[] args)
     {
         Scanner sObj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the Row : ");
        iValue1 = sObj.nextInt();

        System.out.println("Enter the Column : ");
        iValue2 = sObj.nextInt();
        
        Patterns pObj = new Patterns();

        pObj.Pattern(iValue1,iValue1);

     }
 }