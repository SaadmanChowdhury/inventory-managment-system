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
 * @debugID :: 0
 * @version :: 0
 * @file    :: Main.java
 * @created :: NOV 11 2018
 * @edited  :: NOV 11 2018 - 11:07
 * @author  :: SAADMAN SHAHID CHOWDHURY
 *   
 ***/


public class Main {

	
	
	/********************************//* CONSTANTS *//********************************/

	public static final int CLASS_ID = 0;
	 
	/********************************//* VARIABLES *//********************************/ 



	/*********************************//* MAIN *//************************************/ 

	public static void main(String[] args) {
		BP.pln("TEST");
		
		Inventory test = new Inventory.InventoryBuilder()
									  .ID("M11")
									  .name("Mat")
									  .category("Flooring")
									  .picture(123)
									  .averagePrice(0)
									  .quantityRemaining(0)
									  .build();
		
		test.buyInventory(10, 10);
		test.sellInventory(5);
		test.buyInventory(10, 15);
		
	}
		
	/*******************************//* CONSTRUCTOR *//*******************************/ 



	/******************************//* PUBLIC METHODS *//******************************/ 

	

	/*****************************//* PRIVATE METHODS *//******************************/
	
}







/*****************************//* VERSION HISTORY *//******************************/

/*
 *  E: 0 - NOV 11 2018 ***********************************************************
 		Class created.
		
		Public{
			main(String[] args);
		} 
		Private{

		}
 *
 *
 *  E: 1 - MMM DD YYYY ***********************************************************

 * 
 */