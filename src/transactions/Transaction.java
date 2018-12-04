package transactions;
import java.util.ArrayList;

import inventory.Item;
import other.Caution;
import saadman.boilerplate.BP;

/*********************************************
 ****                                     ****
 **         SAADMAN SHAHID CHOWDHURY        **
 **                                         **
 **         saadmanshahid@gmail.com         **
 **           github.com/vajraex            **
 ****                                     ****
 *********************************************/

/***
 *
 * @debugID :: 2
 * @version :: 1
 * @file    :: Transaction.java
 * @created :: DEC 03 2018
 * @edited  :: DEC 03 2018 - 11:07
 * @author  :: SAADMAN SHAHID CHOWDHURY
 *   
 ***/


public class Transaction{
	

	/********************************//* CONSTANTS *//********************************/
	
	public static final int CLASS_ID = 2;
	public static final boolean CONSOLE  = true;
	public static final boolean LOG  = false;
	
	public static int OBJECT_COUNTER = 0;
	public static ArrayList<Transaction> OBJECT_HOLDER = new ArrayList<Transaction>();
	 
	/********************************//* VARIABLES *//********************************/ 
	
	
	
	/******************************//* BUILDER CLASS *//******************************/ 
	
	
		
	/*******************************//* CONSTRUCTOR *//*******************************/ 
	
	
	/*******************************//* SET METHODS *//*******************************/ 
	
	
	
	/*******************************//* GET METHODS *//*******************************/ 

	
	
	/******************************//* PUBLIC METHODS *//******************************/ 
	
	public String toString() {
		String str;
		str = "\nTransaction ID: ";
		
		return str;
	}
	
	
	public boolean buyItem(Item item, int batchQuantity, double batchPrice) {
		int quantity = item.getQuantity();
		double averagePrice = item.getAveragePrice();
		
		if(batchQuantity <= 0) {
			Caution.throwWarning("Need_Positive_Value");
			return false;
		}
		
		int newQuantity = quantity + batchQuantity;
		
		double newPrice = ( ( (double)(batchQuantity) * batchPrice ) + ( (double)(quantity) * averagePrice ) ) 
																	  / (double)(newQuantity);
		
		if(CONSOLE) {
			String str = "\nCalled buyInvetory( Item, int , double )::\n"
					+ "Item: " + item.getID() + " - " + item.getName()  
					+ "Quantitiy Adjustment: " + batchQuantity + ", \tBatch Price: " + batchPrice
					+ "\nNew Quantity: "+ newQuantity +", \tNew Average Price: " + String.format("%.3f", newPrice);
			BP.pln(str);
		}
		
		item.updateQuantity(newQuantity);
		item.updateAveragePrice(newPrice);
		return true;
	}
	
	
	public boolean sellItem(Item item, int batchQuantity) {
		
		int quantity = item.getQuantity();
		double averagePrice = item.getAveragePrice();
		
		if(batchQuantity <= 0) {
			Caution.throwWarning("Need_Positive_Value");
			return false;
		}
		
		int newQuantity = quantity - batchQuantity;
		
		if(newQuantity < 0) {
			Caution.throwWarning("Value_Limit_Exceed");
			return false;
		}
		
		if(CONSOLE) {
			String str = "\nCalled sellInvetory( Item, int )::\n"
					+ "Item: " + item.getID() + " - " + item.getName()  
					+ "Quantitiy Adjustment: " + batchQuantity
					+ "\nNew Quantity: "+ newQuantity;
			BP.pln(str);
		}
		
		item.updateQuantity(newQuantity);
		return true;
	}

	/*****************************//* PRIVATE METHODS *//******************************/

	
	
}

/*****************************//* VERSION HISTORY *//******************************/

/*
 *  E: 1 - DEC 03 2018 ***********************************************************
 		Class created. 
		
		Public{
			Transaction()
			Setter/Getter;
		} 
		Private{

		}
 *
 *
 *  E: 0 - MMM DD YYYY ***********************************************************

 * 
 */