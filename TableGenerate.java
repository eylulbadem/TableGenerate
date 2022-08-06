package src;

import java.util.Scanner;

/**
 * Lab05b - Generating Tables With Each Cell Indicating the "row,col" Values
 * @author Eylul Badem
 * @version 23.11.2020
*/ 
public class Lab05b
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        // Variables
        
        int row;
        int column;
        int columnCount;
        
        // Program Code
        
        // 1-Ask & get the number of rows from the user
        System.out.println( "number of rows?");
        row = scan.nextInt();
            
        // 2-Ask & get the number of columns from the user
        System.out.println( "number of columns?");
        column = scan.nextInt();    
        
        System.out.println();
        columnCount = 0;
        
        System.out.println( "the row & column numbers table");
     
        int rowCount = 0;
        
        // 3-Print out a table which each cell has the row number, a comma and the column number
        while ( rowCount < row )
        {
            rowCount = rowCount + 1;
            columnCount = 0;
            while ( columnCount < column )
           {
               int gap = 0;
               columnCount = columnCount + 1;
               String str = rowCount + "," + columnCount;
               while ( 6 - str.length() > gap )
               {
                   System.out.print( " ");
                   gap = gap + 1;
               }
               System.out.print( str);
           }
           System.out.println();
        }
        
        
        System.out.println();
        System.out.println( "the product of the row & column number table");
        
        rowCount = 0;
        
        // 4-Print out a table which multiplies the row number and the column number
        while ( rowCount < row )
        {
            rowCount = rowCount + 1;
            columnCount = 0;
            while ( columnCount < column )
           {
            int gap = 0;
            columnCount = columnCount + 1;
            String str1 =  Integer.toString(rowCount * columnCount);
            while ( 6 - str1.length() > gap )
            {
                System.out.print( " ");
                gap = gap + 1;
            }
            System.out.print( str1);
           }
           System.out.println();
        }
        
        
        System.out.println();
        System.out.println( "the cell number beginning from 0 and increasing table");
        
        rowCount = 0;
        int cellNumber = 1;
        
        // 5-Print out a table which each cell has the cell number
        while ( rowCount < row )
        {
            rowCount = rowCount + 1;
            columnCount = 0;
            while ( columnCount < column )
           {
            int gap = 0;
            columnCount = columnCount + 1;
            String str2 =  Integer.toString(cellNumber);
            while ( 6 - str2.length() > gap )
            {
                System.out.print( " ");
                gap = gap + 1;
            }
            System.out.print( str2);
            cellNumber = cellNumber + 1;
           }
           System.out.println();
        }
        
        System.out.println();
        System.out.println( "the row number in the first column only");
        
        rowCount = 0;
        
        // 6-Print out a table which has the row number in the first column only
        while ( rowCount < row )
        {
            rowCount = rowCount + 1;
            columnCount = 0;
            while ( columnCount < column )
            {
            int gap = 0;
               columnCount = columnCount + 1;
               if ( columnCount == 1)
               {
                    String str3 =  (rowCount + ",-");
                    while ( 6 - str3.length() > gap )
                    {
                        System.out.print( " ");
                        gap = gap + 1;
                    }
                    System.out.print( str3);
               }
               else
               {
                    String str4 =  ("-,-");
                    while ( 6 - str4.length() > gap )
                    {
                        System.out.print( " ");
                        gap = gap + 1;
                    }
                    System.out.print( str4);
               }
           }
           System.out.println();
        }
        
        scan.close();
    }  
}