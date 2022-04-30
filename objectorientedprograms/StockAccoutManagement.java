package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
/*
 * Author:Prasad
 * Program to print the stock report with total value of each stock and total value of stock
 */
public class StockAccoutManagement {

	public static void main(String[] args) {
		//object
		Stock stock =new Stock();
		StockPortfolio stockPortfolio = new StockPortfolio();
		int i = 0;
		stock.stockNumbers = 5;
		
		while(i < stock.stockNumbers) {			
			stock.addStock();
			stockPortfolio.input();
			stockPortfolio.calculateStockValue();
			stockPortfolio.totalStockValue();
			System.out.println("The stock report of" + stock.list.get(i));
			System.out.println("The stock value of "+ stock.list.get(i)+ "is" + stockPortfolio.eachStockValue);
			System.out.println("Total value of stock is:" + stockPortfolio.totalStockValue);
			i++;
		}
	}
}

    class Stock{
    	//variables
    	int stockNumbers;
    	String shareNames;
    	ArrayList<String> list = new ArrayList<String>();
    	
    	/*
    	 * This method add stock to the array list
    	 */
		public void addStock() { 		
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter share name");
    		shareNames = sc.next();
    		list.add(shareNames);
    		System.out.println("Stocks Name:" + list);
    	}
    }
    
    class StockPortfolio {
    	//variables
    	float sharePrice;
		int numOfShare;
		float eachStockValue;
		double totalStockValue = 0.0f;
		//object
		Stock stock1 = new Stock();
    	
		/*
		 * input the share price and number of shares
		 */
    	public void input() { 
    		Scanner sc1 = new Scanner(System.in);
    		System.out.println("Enter share price");
    		sharePrice = sc1.nextFloat();
    		System.out.println("Enter number of shares");
    		numOfShare = sc1.nextInt();
    	}
    	
    	/*
    	 * This method calculate stockvalue
    	 */
    	public double calculateStockValue() {
    		eachStockValue = sharePrice * numOfShare;
			return eachStockValue;
    	}
    	
    	/*
    	 * This method calculate total stock value
    	 */
    	public double totalStockValue() {
   // 		System.out.println();
    		return totalStockValue = totalStockValue + eachStockValue; 
    		}
    	}
	    
    
	

