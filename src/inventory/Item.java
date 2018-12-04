package inventory;
import java.util.ArrayList;

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
 * @debugID :: 1
 * @version :: 4
 * @file    :: Item.java
 * @created :: NOV 11 2018
 * @edited  :: DEC 04 2018 - 09:45
 * @author  :: SAADMAN SHAHID CHOWDHURY
 *   
 ***/



public class Item {


	/*********************************//* STATIC *//**********************************/
	
	public static final int CLASS_ID = 1;
	public static final boolean CONSOLE  = true;
	public static final boolean LOG  = false;
	
	public static int OBJECT_COUNTER = 0;
	public static ArrayList<Item> OBJECT_HOLDER = new ArrayList<Item>();
	
	/********************************//* VARIABLES *//********************************/ 
	
	public final int OBJ_ID;
	
	protected String ID;
	protected String name;
	protected String category;
	protected int picture;
	
	protected int quantity;
	protected double averagePrice;
	protected double averageWeight;
	
	/******************************//* BUILDER CLASS *//******************************/ 
	
	public static final class ItemBuilder{
		
		private String ID = null;
		private String name  = null;
		private String category  = null;
		private int picture = -1;
		
		private int quantity = -1;
		private double averagePrice = -1.0;
		private double averageWeight = -1.0;
		
		public Item build() {
			Item tempObj = new Item(this);
			OBJECT_HOLDER.add(tempObj);
			
			return tempObj;
		}
		
		public ItemBuilder ID(String ID) {
			this.ID = ID;
			return this;
		}
		
		public ItemBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public ItemBuilder category(String category) {
			this.category = category;
			return this;
		}
		
		public ItemBuilder picture(int picture) {
			this.picture = picture;
			return this;
		}
		
		public ItemBuilder quantity(int quantity) {
			this.quantity = quantity;
			return this;
		}
		
		public ItemBuilder averagePrice(double averagePrice) {
			this.averagePrice = averagePrice;
			return this;
		}
		
		public ItemBuilder averageWeight(double averageWeight) {
			this.averageWeight = averageWeight;
			return this;
		}
		
	}
	
	public static final class ItemDestroyer{  //******************************************************************  EDIT REQUIRED
		
	}
	
	/*******************************//* CONSTRUCTOR *//*******************************/ 
	
	private Item (ItemBuilder builder) {
		ID = builder.ID;
		name = builder.name;
		category = builder.category;
		picture = builder.picture;
		quantity = builder.quantity;
		averagePrice = builder.averagePrice;
		
		OBJ_ID = OBJECT_COUNTER;
		OBJECT_COUNTER++;
		
		if(CONSOLE) {
			BP.pln("\nCREATED ::" + this.toString());
		}
	}
	
	/*******************************//* SET METHODS *//*******************************/ 
	
	
	public void setQuantity(int quantity) {
		if(quantity <= 0) {
			Caution.throwWarning("Need_Positive_Value");
			return;
		}
		
		this.quantity = quantity;
	}
	
	public void setAveragePrice(int averagePrice) {
		if(averagePrice <= 0) {
			Caution.throwWarning("Need_Positive_Value");
			return;
		}
		
		this.averagePrice = averagePrice;
	}
	
	public void updateID(String ID) {
		if( Caution.requestConfirmation("Confirm forced update of Item's ID ?") ) {
			this.ID = ID;
		}
	}
	
	public void updateName(String name) {
		if( Caution.requestConfirmation("Confirm forced update of Item's Name ?") ) {
			this.name = name;
		}
	}
	
	public void updateCategory(String category) {
		if( Caution.requestConfirmation("Confirm forced update of Item's Category ?") ) {
			this.category = category;
		}
	}
	
	public void updatePicture(int picture) {
		if( Caution.requestConfirmation("Confirm forced update of Item's Picture ?") ) {
			this.picture = picture;
		}
	}
	
	public void updateQuantity(int quantity) {
		if(quantity <= 0) {
			Caution.throwWarning("Need_Positive_Value");
			return;
		}
		
		if( Caution.requestConfirmation("Confirm forced update of Item's Quantity ?") ) {
			this.quantity = quantity;
		}
	}
	
	public void updateAveragePrice(double averagePrice) {
		if(averagePrice <= 0) {
			Caution.throwWarning("Need_Positive_Value");
			return;
		}
		
		if( Caution.requestConfirmation("Confirm forced update of Item's Average Price ?") ) {
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
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getAveragePrice() {
		return averagePrice;
	}

	/******************************//* PUBLIC METHODS *//******************************/ 
	
	public String toString() {
		
		String str = "\nItem Object No. " + OBJ_ID + ", Item_ID: " + ID + 
				", Item_Name: " + name + ", Category: " + category + ", Picture_Num: " + picture + 
				"\nQuantitiy Remaining: " + quantity + ", Average Price: " + String.format("%.2f", averagePrice);
		
		return str;
		
	}
	
	public static String getItemIDFormat() {     //***************************************************************  EDIT REQUIRED
		return "ITEM_ID_XXXX";
	}
	
	public static boolean verifyItemIDFormat(String newID) {     //***********************************************  EDIT REQUIRED
		/** receives a string and verifies if this is a valid ID **/
		return true;
	}
	
	public static Item findItem(String itemName) {
		for(int i=0; i<OBJECT_HOLDER.size(); i++)
			if( itemName.equals( OBJECT_HOLDER.get(i).getName() ) ) 
				return OBJECT_HOLDER.get(i);
			
		return null;
	}


	/*****************************//* PRIVATE METHODS *//******************************/

	
	
}

/*****************************//* VERSION HISTORY *//******************************/

/*
 *  E: 1 - NOV 11 2018 ***********************************************************
 		Class created as "Inventory.java".
		
		Public{
			ItemBuilder { };
			Setter/Getter Methods;
			toString( );
			buyItem(int, double );
			sellItem(int );
			requestConfirmation( );
			throwError(String );
		} 
		
		Private{
			Item(ItemBuilder );
			
			protected String ID;
			protected String name;
			protected String category;
			protected int picture;
			protected int quantity;
			protected double averagePrice;
		}
 
 *
 *  E: 2 - DEC 02 2018 ***********************************************************
		
		Added ::
			- public void addItem(int);
		Renamed ::
			- buyItem (int, double) -- to - addItem(int, double)
			- sellItem(int) ---------- to - subtractItem(int)
			
 * 
 *  E: 3 - DEC 03 2018 ***********************************************************
 		Refactor ::
 			Renamed "Inventory.java" to "Item.java"
 		
 * 
 *  E: 4 - DEC 04 2018 ***********************************************************
 		Moved ::
	 		- requestConfirmation( ) ------------------ moved to Caution.java
			- throwError( String ) to Caution.java ---- moved to Caution.java
	 		- Moved addItem( -- ) to Buy.java --------- moved to Transaciton.java
	 		- Moved subtractItem ( -- ) to Sell.java -- moved to Transaciton.java
	 	Added ::
	 		- public static verifyItemIDFromat(String ); ----------------------------------------  incomplete
	 		- protected averageWeight;
 *
 *  E: 5 - DEC 04 2018 ***********************************************************
 
 
 *  
 */