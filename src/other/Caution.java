package other;
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
 * @debugID :: 6
 * @version :: 0
 * @file    :: Caution.java
 * @created :: DEC 04 2018
 * @edited  :: DEC 04 2018 - 00:00
 * @author  :: SAADMAN SHAHID CHOWDHURY
 *   
 ***/


public final class Caution {


	/********************************//* CONSTANTS *//********************************/
	
	public static final int CLASS_ID = 6;
	public static final boolean CONSOLE  = true;
	public static final boolean LOG  = true;
	 
	/********************************//* VARIABLES *//********************************/ 
	
	
	
	/******************************//* BUILDER CLASS *//******************************/ 
	
	
		
	/*******************************//* CONSTRUCTOR *//*******************************/ 
	
	
	
	/*******************************//* SET METHODS *//*******************************/ 
	
	
	
	/*******************************//* GET METHODS *//*******************************/ 



	/******************************//* PUBLIC METHODS *//******************************/ 
	
	  
	public static boolean requestConfirmation(String text) {  //*******************************************************  EDIT REQUIRED
		/*****  Show Warning, and request user confirmation on GUI  *****/
		/***** if user accepts, return true, otherwise return false *****/
		return true;
	}
	
	public static void throwWarning(String error) {  //****************************************************************  EDIT REQUIRED
		
		switch(error) {
		
		case "Need_Positive_Value" :
			/***** Show Warning on GUI *****/
			BP.pln("Value must be Positive.");
			break;
			
		case "Value_Limit_Exceed" :
			/***** Show Warning on GUI *****/
			BP.pln("Requested Adjustment exceeds existing amount.");
			break;
		case "Format does not match":
			/***** Show Warning on GUI *****/
			BP.pln("The entered value does not match the format.");
		}
		
	}

	/*****************************//* PRIVATE METHODS *//******************************/


}
/*****************************//* VERSION HISTORY *//******************************/

/*
 *  E: 1 - DEC 04 2018 ***********************************************************
 		Class created. 
	
		Moved ::
			- requestConfirmation( ); ---------- moved from Item.java
			- throwError(String ); ------------- moved from Item.java
			
		Edit ::
			- requestConfirmation( ); ---------- to requestConfirmationn(String );
	
		Public{
			requestConfirmation( ); ----------------------------------------------   incomplete
			throwError(String );    ----------------------------------------------   incomplete
		} 
		Private{

		}
 *
 *
 *  E: 2 - MMM DD YYYY ***********************************************************

 * 
 */
