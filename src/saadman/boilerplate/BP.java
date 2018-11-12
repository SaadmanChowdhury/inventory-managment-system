package saadman.boilerplate;

/*********************************************
 ****                                     ****
 **         SAADMAN SHAHID CHOWDHURY        **
 **                                         **
 **         saadmanshahid@gmail.com         **
 **           github.com/vajraex            **
 ****                                     ****
 *********************************************/

// C++ BOILER PLATE - Converted to JAVA

// Version   :: 3
// Last Edit :: NOV 11, 2018

/*********************************************
 * 
 * @author MEMBER FUNCTIONS:
 * 
 * 	LOGICAL:
 * 		(1) max         ( int , int ) ---->	return MAX value
 * 		(2) min         ( int , int ) ---->	return MIN value
 * 		(3) maxSelect   ( int , int ) ---->	return index of MAX value
 * 		(4) maxSelect   ( int , int ) ---->	return index of MIN value
 * 
 * 	PRINTERS:
 * 		(1) p           ( Object )    ----> print text without line
 * 		(2) pln         ( Object )    ----> print text with line 
 * 		(3) pln         (  )          ----> print blank line 
 * 
 *********************************************/

public final class BP{
	
	
	/**************** LOGICAL ****************/
	
	public static int max(int a, int b){
		if(a>b)
			return a;
		else
			return b;
	}
	
	public static int min(int a, int b){
		if(a<b)
			return a;
		else
			return b;
	}
	
	public static int maxSelect(int a, int b){
		if(a>b)
			return 0;
		else
			return 1;
	}
	
	public static int minSelect(int a, int b){
		if(a<b)
			return 0;
		else
			return 1;
	}
	
	
	/**************** PRINTERS ****************/
	
	public static void p(Object variable){
		System.out.print(variable);
	}
	
	public static void pln(){
		System.out.println();
	}
	
	public static void pln(Object variable){
		System.out.println(variable);
	}
	
	
}
