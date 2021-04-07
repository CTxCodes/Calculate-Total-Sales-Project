


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cjt1496
 */

// Company has 4 sales people
// They sell 5 different products
// The product type is listed as { The Sales Person Number, The Product Number, The total Dollar value of that product sold that day

/* 
Each column represents a sales person 
Each row represents a particular product
each cross-row should display total sales of the product for the monthh
each cross-coulmn should display total sales by the sales person for the last month

*/

import java.util.Arrays;
import java.util.Scanner;

public class TotalSales {
    //String[][] saleSlips = new String[4][5];
    
   double sales[][];
   int salesPersonNumber;
   int productNumber;
   double salesAmt;
   int row, col;
   
   
   public void Sales()
   {
      Scanner input = new Scanner(System.in);
	  
	  // sales array holds data on number of each product sold
	  // by each of 4 salesman
	  sales = new double[5][4];
	  
	  System.out.print ("Input sales person number (-1 to end) : ");
	  salesPersonNumber = input.nextInt();
	  
	  while (salesPersonNumber != -1)
	  {
	    System.out.print("Input product number: ");
        productNumber = input.nextInt();
        System.out.print("Input sales amount: ");
        salesAmt = input.nextDouble();
		
		if (salesPersonNumber >= 1 && salesPersonNumber < 5 && productNumber >= 1 && productNumber < 6 && salesAmt >= 0){
                    sales[salesPersonNumber-1][productNumber-1] += salesAmt;
                }
                if (productNumber > 5)  {
		    System.out.print("Invalid input!\n");
                }
		
		System.out.print("Input sales person number (-1 to end): ");
		salesPersonNumber = input.nextInt(); 
   			
                } 
	  
	  double personTotal[] = new double[4];
	  
	  for ( col = 0; col < 4; col++)
	     personTotal[col] = 0;
		 
	  System.out.printf("%7s%14s%14s%14s%14s%14s\n", "Product", "Person 1",
                            "Person 2", "Person 3", "Person 4","Total ");
	
	  for ( row = 0; row < 5; row++)
	  {
	     double productTotal = 0.0;
		 System.out.printf("%7d", (row + 1));
		 
		 for (int col = 0; col < 4; col++)
		 {
		    System.out.printf("%14.2f", sales[row][col]);
                    
			productTotal += sales[row][col];
                        
			personTotal[col] += sales[row][col];
		 } 
		 System.out.printf("%14.2f\n", productTotal);
		 
	  }
	  
	  System.out.printf("%7s", "T_Sales");
	  
	  for (int col = 0; col < 4; col++)
	     System.out.printf("%14.2f", personTotal[col]);
	  
             System.out.println();
             
   }
}
