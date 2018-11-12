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
 * @debugID :: 1
 * @version :: 0
 * @file    :: Inventory.java
 * @created :: NOV 11 2018
 * @edited  :: NOV 11 2018 - 11:07
 * @author  :: SAADMAN SHAHID CHOWDHURY
 *   
 ***/



public class Inventory {


	/*********************************//* STATIC *//**********************************/
	
	public static final int CLASS_ID = 1;
	public static final boolean CONSOLE  = true;
	public static final boolean LOG  = false;
	
	public static int NUMBER_OF_INVENTORY = 0;
	
	/********************************//* VARIABLES *//********************************/ 
	
	public final int OBJ_ID;
	
	protected String ID;
	protected String name;
	protected String category;
	protected int picture;
	
	protected int quantityRemaining;
	protected double averagePrice;
	
	/******************************//* BUILDER CLASS *//******************************/ 
	
	public static final class InventoryBuilder{
		
		private String ID;
		private String name;
		private String category;
		private int picture;
		
		private int quantityRemaining;
		private double averagePrice;
		
		public Inventory build() {
			return new Inventory(this);
		}
		
		public InventoryBuilder ID(String ID) {
			this.ID = ID;
			return this;
		}
		
		public InventoryBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public InventoryBuilder category(String category) {
			this.category = category;
			return this;
		}
		
		public InventoryBuilder picture(int picture) {
			this.picture = picture;
			return this;
		}
		
		public InventoryBuilder quantityRemaining(int quantityRemaining) {
			this.quantityRemaining = quantityRemaining;
			return this;
		}
		
		public InventoryBuilder averagePrice(double averagePrice) {
			this.averagePrice = averagePrice;
			return this;
		}
		
	}
		
	/*******************************//* CONSTRUCTOR *//*******************************/ 
	
	public Inventory (InventoryBuilder builder) {
		ID = builder.ID;
		name = builder.name;
		category = builder.category;
		picture = builder.picture;
		quantityRemaining = builder.quantityRemaining;
		averagePrice = builder.averagePrice;
		
		OBJ_ID = NUMBER_OF_INVENTORY;
		
		NUMBER_OF_INVENTORY++;
		
		if(CONSOLE) {
			BP.pln("\nCREATED ::\n" + this.toString());
		}
	}
	
	/*******************************//* SET METHODS *//*******************************/ 
	
	public void setID(String ID) {
		if( requestConfirmation() ) {
			this.ID = ID;
		}
	}
	
	public void setName(String name) {
		
		if( requestConfirmation() ) {
			this.name = name;
		}
	}
	
	public void setCategory(String category) {
		
		if( requestConfirmation() ) {
			this.category = category;
		}
	}
	
	public void setPicture(int picture) {
		
		if( requestConfirmation() ) {
			this.picture = picture;
		}
	}
	
	public void setQuantityRemaining(int quantityRemaining) {
		
		if( requestConfirmation() ) {
			this.quantityRemaining = quantityRemaining;
		}
	}
	
	public void setAveragePrice(double averagePrice) {
		
		if( requestConfirmation() ) {
			this.averagePrice = averagePrice;
		}
	}
	
	/*******************************//* GET METHODS *//*******************************/ 

	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getPicture() {
		return picture;
	}
	
	public int getQuantityRemaining() {
		return quantityRemaining;
	}
	
	public double getAveragePrice() {
		return averagePrice;
	}

	/******************************//* PUBLIC METHODS *//******************************/ 
	
	public String toString() {
		
		String str = "Inventory Object No. " + OBJ_ID + ", Inventory_ID: " + ID + 
				", Inventory_Name: " + name + " Category: " + category + ", Picture_Num: " + picture + 
				"\nQuantitiy Remaining: " + quantityRemaining + ", Average Price: " + averagePrice + "\n";
		
		return str;
		
	}
	
	public void buyInventory(int adjustQuantity, double batchPrice) {
		
		if(adjustQuantity <= 0) {
			throwError("Need_Positive_Value");
			return;
		}
		
		int newQuantity = quantityRemaining + adjustQuantity;
		
		double newPrice = ( ( (double)(adjustQuantity) * batchPrice ) + ( (double)(quantityRemaining) * averagePrice ) ) 
																	  / (double)(newQuantity);
		
		if(CONSOLE) {
			String str = "\nNew Transaction::\n"
					+ "Quantitiy Adjustment: " + adjustQuantity + ", Batch Price: " + batchPrice
					+ "\nNew Quantity: "+ newQuantity +", New Average Price: " + newPrice;
			BP.pln(str);
		}
		
		this.quantityRemaining = newQuantity;
		this.averagePrice = newPrice;
		
	}
	
	public void sellInventory(int adjustQuantity) {
		
		if(adjustQuantity <= 0) {
			throwError("Need_Positive_Value");
			return;
		}
		
		int newQuantity = quantityRemaining - adjustQuantity;
		
		if(newQuantity < 0) {
			throwError("Value_Limit_Exceed");
			return;
		}
		
		this.quantityRemaining = newQuantity;
	}
	
	  
	public boolean requestConfirmation() {  //*************************************************************************  EDIT REQUIRED
		return true;
	}
	
	public void throwError(String error) {  //*************************************************************************  EDIT REQUIRED
		
		switch(error) {
		
		case "Need_Positive_Value" :
			/***** Show Warning on GUI *****/
			BP.pln("Value must be Positive.");
			break;
			
		case "Value_Limit_Exceed" :
			/***** Show Warning on GUI *****/
			BP.pln("Requested Adjustment exceeds existing amount.");
			break;
		}
		
	}

	/*****************************//* PRIVATE METHODS *//******************************/

	
	
}

/*****************************//* VERSION HISTORY *//******************************/

/*
 *  E: 0 - MMM DD YYYY ***********************************************************
 		Class created. Purpose of the class is to:
 			(1)
		
		Public{

		} 
		Private{

		}
 *
 *
 *  E: 1 - MMM DD YYYY ***********************************************************

 * 
 */