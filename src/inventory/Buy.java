package inventory;
import java.util.ArrayList;
import java.util.Date;

import other.IDGenerator;
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
 * @debugID :: 3
 * @version :: 0
 * @file    :: Buy.java
 * @created :: DEC 03 2018
 * @edited  :: DEC 03 2018 - 11:07
 * @author  :: SAADMAN SHAHID CHOWDHURY
 *   
 ***/


public class Buy  {


	/********************************//* CONSTANTS *//********************************/
	
	public static final int CLASS_ID = 3;
	public static final boolean CONSOLE  = true;
	public static final boolean LOG  = false;
	
	//public static int OBJECT_COUNTER = 0;
	//public static ArrayList<Buy> OBJECT_HOLDER = new ArrayList<Buy>();
	 
	/********************************//* VARIABLES *//********************************/ 
	
	protected String buyID;
	protected String refID;
	protected String itemID;
	
	protected    int quantity;
	protected double unitPrice;
	protected double unitWeight;
	
	/******************************//* BUILDER CLASS *//******************************/ 
	
//	public static final class BuyBuilder{
//		private String buyID = null;
//		private String refID = null;
//		private String itemID = null;
//		private    int quantity = -1;
//		private double unitPrice = -1.0;
//		private double unitWeight = -1.0;
//	}
		
	/*******************************//* CONSTRUCTOR *//*******************************/ 

	public Buy(String refID, String itemID, int quantity, double unitPrice, double unitWeight) {
		
		this.buyID      = IDGenerator.nextID("Buy");
		
		this.refID      = refID;
		this.itemID     = itemID;
		this.quantity   = quantity;
		this.unitPrice  = unitPrice;
		this.unitWeight = unitWeight;
		
		if(CONSOLE) {
			BP.pln("\nCREATED ::" + this.toString());
		}
	}
	
	/*******************************//* SET METHODS *//*******************************/ 
	
	
	
	/*******************************//* GET METHODS *//*******************************/ 



	/******************************//* PUBLIC METHODS *//******************************/ 
	
	

	/*****************************//* PRIVATE METHODS *//******************************/



	
}

/*****************************//* VERSION HISTORY *//******************************/

/*
 *  E: 1 - MMM DD YYYY ***********************************************************
 		Class created. Purpose of the class is to:
 			(1)
		
		Public{

		} 
		Private{

		}
 *
 *
 *  E: 2 - MMM DD YYYY ***********************************************************

 * 
 */

