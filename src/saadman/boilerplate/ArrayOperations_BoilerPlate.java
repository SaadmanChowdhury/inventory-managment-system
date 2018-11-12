package saadman.boilerplate;

/*********************************************
 ****                                     ****
 **         SAADMAN SHAHID CHOWDHURY        **
 **                                         **
 **         saadmanshahid@gmail.com         **
 **           github.com/vajraex            **
 ****                                     ****
 *********************************************/

// Java Specific BoilerPlate for Array based operations ONLY

// Version   :: 3
// Last Edit :: NOV 11, 2018

/*********************************************
 * 
 * @author MEMBER FUNCTIONS:
 * 
 * 	CONVERTERS:
 * 		(1) intArrayToString		  (Integer[]  ) ----> String
 * 		(2) intArrayToStringArray     (Integer[]  ) ----> String[]
 * 		(3) int2DArraytoString2DArray (Integer[][]) ----> String[][]
 * 
 * 	PRINTERS:
 * 		(1) print2DArray              (String[][]) -----> Print 2D array with Space and Line
 * 		(2) printArray                (String[])   -----> Separates element with Space
 * 		(3) printBoard				  (String[])   -----> Specialized in printing tiled boards
 * 
 * 	GENERATORS:
 * 		(1) generate2DBoard			  (String[][]) ----> generates String[] on tiled board
 *  
 *
 *********************************************/


public class ArrayOperations_BoilerPlate {

	public static String[] generate2DBoard(final String[][] Ark){
		
		final int ROW = Ark.length;
		final int COL = Ark[0].length;
		
		String[] spark = new String[ROW*3+1];
		
		for(int i=0;i<ROW*3+1;i++)
			spark[i]="";
		
		for(int c=0;c<COL;c++)
			spark[0] = spark[0] + " _ _ _";
		
		for(int r=0;r<ROW;r++){
			
			for(int c=0;c<COL;c++)
				spark[r*3+1] = spark[r*3+1] + "|     ";  
			spark[r*3+1] = spark[r*3+1] + "|";
			
			for(int c=0;c<COL;c++){
				spark[r*3+2] = spark[r*3+2] + "|"; 
				
				int offset = Ark[r][c].length();
				
				if(offset==0)
					spark[r*3+2] = spark[r*3+2] + "     "; 
				if(offset==1)
					spark[r*3+2] = spark[r*3+2] + "  "+Ark[r][c]+"  "; 
				if(offset==2)
					spark[r*3+2] = spark[r*3+2] + "  "+Ark[r][c]+" " ;
				if(offset==3)
					spark[r*3+2] = spark[r*3+2] +  " "+Ark[r][c]+" " ;
				if(offset==4)
					spark[r*3+2] = spark[r*3+2] +  " "+Ark[r][c]+""  ;
				if(offset==5)
					spark[r*3+2] = spark[r*3+2] +   ""+Ark[r][c]+""  ;
			}
			spark[r*3+2] = spark[r*3+2] + "|"; 
			
			for(int c=0;c<COL;c++)
				spark[r*3+3] = spark[r*3+3] + "|_ _ _";  
			spark[r*3+3] = spark[r*3+3] + "|";
		}
		
		return spark;
	}
	
	
	public static void printBoard(String[] Ark){
		for(int i=0;i<Ark.length;i++){
			BP.p(Ark[i]);
			BP.pln();
		}
			
	}

	public static String intArrayToString(Integer[] Ark){
		String str = "";
		
		for(int i=0;i<Ark.length;i++)
			str += Ark[i].toString();
		
		return str;
	}
	
	public static String[] intArrayToStringArray(Integer[] Ark){
		
		String[] stark = new String[Ark.length];
		
		for(int i=0;i<Ark.length;i++)
			stark[i] = Ark[i].toString();
		
		return stark;
	}
	
	public static String[][] int2DArrayToString2DArray(Integer[][] Ark){
		String[][] stark = new String[Ark.length][];
		
		for(int i=0;i<Ark.length;i++)
			stark[i] = intArrayToStringArray(Ark[i]); 
		
		return stark;
	}
	
	public static void printArray(String[] Ark){
		for(int i=0;i<Ark.length;i++)
			BP.p(Ark[i]+ " ");
		BP.pln();
	}
	
	public static void print2DArray(String[][] Ark){
		for(int i=0;i<Ark.length;i++)
			printArray(Ark[i]);
	}
}


