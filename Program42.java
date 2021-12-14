//Accept number of rows and number of columns from user and display below
//pattern.
//
// Input : iRow = 4    iCol = 4
//                           
//                          ___1_____ 2______3_____4____
//
//  4  4  4  4           1 |  (11)   (12)   (13)  (14)        
//  3  3  3  3           2 |  (21)   (22)   (23)  (24)       
//  2  2  2  2           3 |  (31)   (32)   (33)  (34)     
//  1  1  1  1           4 |  (41)   (42)   (43)  (44)                   
//
//////////////////////////////////////////////////////////////

import java.util.Scanner;


class Patterns
 {
    public void pattern(int iRow, int iColumn)
     {
      int i = 0, j = 0;
      char cChar1 , cChar2;

        for (i = iRow; i>= 1 ; i--)
          {
            for (j = 1; j <= iColumn ; j++)
              {
                     System.out.print(i+"\t");
                                      
              }
            System.out.println("");   
          }

     }
 }

class Program42
 {
   public static void main(String[] args)
     {
         Scanner sObj = new Scanner(System.in);
        int iValue1 =0 , iValue2 = 0;

        System.out.println("Enter the row : ");
        iValue1 = sObj.nextInt();

        System.out.println("Enter the Column : ");
        iValue2 = sObj.nextInt();
        
        Patterns pObj = new Patterns();

        pObj.pattern(iValue1,iValue2);


     }
 }
