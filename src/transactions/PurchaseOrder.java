package transactions;

import java.util.ArrayList;
import java.util.Date;

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
 * @debugID :: 7
 * @version :: 0
 * @file    :: PurchaseOrder.java
 * @created :: DEC 04 2018
 * @edited  :: MMM DD YYYY - 00:00
 * @author  :: SAADMAN SHAHID CHOWDHURY
 *   
 ***/


public class PurchaseOrder {


	/********************************//* CONSTANTS *//********************************/
	
	public static final int CLASS_ID = 7;
	public static final boolean CONSOLE  = true;
	public static final boolean LOG  = false;
	
	public static int OBJECT_COUNTER = 0;
	public static ArrayList<PurchaseOrder> OBJECT_HOLDER = new ArrayList<PurchaseOrder>();
	 
	/********************************//* VARIABLES *//********************************/ 
	
	protected String refID;
	protected double totalPrice;
	protected double totalWeight;
	protected   Date date;
	protected String buyerName;
	protected String signedBy;
	protected String sellerName;
	protected String sellerCompany;
	protected String sellerAddress;
	protected String sellerPhone;
	protected String sellerEmail;
	
	
	
	/******************************//* BUILDER CLASS *//******************************/ 
	
	
		
	/*******************************//* CONSTRUCTOR *//*******************************/ 
	
	
	
	/*******************************//* SET METHODS *//*******************************/ 
	
	
	
	/*******************************//* GET METHODS *//*******************************/ 



	/******************************//* PUBLIC METHODS *//******************************/ 
	
	

	/*****************************//* PRIVATE METHODS *//******************************/



	/*****************************//* VERSION HISTORY *//******************************/

	/*
	 *  E: 1 - MMM DD YYYY ***********************************************************
	 		Class created. 
			
			Public{

			} 
			Private{

			}
	 *
	 *
	 *  E: 2 - MMM DD YYYY ***********************************************************

	 * 
	 */
	
}
