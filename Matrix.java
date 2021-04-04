// Code By Md Arif Uddin
package code;

import java.util.Scanner;


public class Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int [] [] A= new int [2][3];
        int [] [] B = new int [2][3];
        
        int row,col;
           
          System.out.println("Enter A Matrix");
          
          // Input for A Matrix 
          
        for(row=0; row<2; row++)
        {
            for(col=0; col<3;col++)
            {
                System.out.printf("A[%d][%d] =",row,col);
                A[row][col]=input.nextInt();
                
            }
        }
        
        
          System.out.println("Enter B Matrix");
          
          // Input for B Matrix 
          
        for(row=0; row<2; row++)
        {
            for(col=0; col<3;col++)
            {
                System.out.printf("B[%d][%d] =",row,col);
                B[row][col]=input.nextInt();
                
            }
        }
        
        // Parinting A Matrix
         System.out.println("A =");
         for(row=0; row<2; row++)
        {
            for(col=0; col<3;col++)
            {
                
               
                System.out.print(" "+A[row][col]);
                
            }
            System.out.println();
        }
         
         
          // Parinting B Matrix
           System.out.println("B =");
         for(row=0; row<2; row++)
        {
            for(col=0; col<3;col++)
            {
                
                
                System.out.print(" "+B[row][col]);
                
            }
             System.out.println();
        }
         
         
         // Now I will do Sum A and B Matrix 
         
           System.out.println("A+B =");
         for(row=0; row<2; row++)
        {
            for(col=0; col<3;col++)
            {
                
                
                System.out.print(" "+(A[row][col] + B[row][col]));
               
                
            }
             System.out.println();
        }
    }
    
}
