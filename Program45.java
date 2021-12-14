//Accept number of rows and number of columns from user and display below
//pattern.
//
// Input : iRow = 4    iCol = 4
//                           
//                          ___4_____ 3______2_____1____
//
//  *  *  *  *           1 |  (14)   (13)   (12)  (11)        
//  *  *  *  #           2 |  (24)   (23)   (22)  (21)       
//  *  *  #  #           3 |  (34)   (33)   (32)  (31)     
//  *  #  #  #           4 |  (44)   (43)   (42)  (41)                   
//
//////////////////////////////////////////////////////////////

import java.util.Scanner;

class Patterns
 {

   public void Pattern(int iRow, int iColumn)
    {
      int i = 0, j = 0;
        for(i = 1; i <= iRow; i++ )
           {
             for (j=iColumn; j >= 1; j-- )
               {
                  if(i > j)
                   {
                    System.out.print("#\t");
                   }
                  else
                   {
                    System.out.print("*\t");
                   } 

               }
             System.out.println("");  
           }
    }
 }

class Program45
 {
   public static void main(String[] args)
     {
         Scanner sObj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the Row : ");
        iValue1 = sObj.nextInt();

        System.out.println("Enter the Row : ");
        iValue2 = sObj.nextInt();
        
        Patterns pObj = new Patterns();

        pObj.Pattern(iValue1,iValue1);

     }
 }