/*
 * Author: Amanda
 * Date: 2/4/2016
 */
public class BeerSongJ {

	public static void main(String[] args) {
		
		ninetyNineBottlesOfBeer();
			
				
			}//End method main
	
	/*
	 * Function to print beer song in console
	 */
	
	public static void ninetyNineBottlesOfBeer(){
		int i;       //counter for loop
		int num = 99;      // number  
	    int newNum;        // Number-1
	    newNum = num-1; 
		
		for (i=1; i<=97; i++)
		{
			System.out.println(num + " bottles of beer on the wall, " + num + " bottles of beer ");
			System.out.println("take one down, pass it around, " + newNum + " bottles of beer on the wall. ");
			
			num = num-1;
			newNum = newNum-1;
			
		} //End for
		
		
			System.out.println("2 bottles of beer on the wall, 2 bottles of beer,\n take one down, pass it around, 1 bottle of beer on the wall. ");
			System.out.println("1 bottle of beer on the wall, 1 bottle of beer, \n take one down, pass it around, no more bottles of beer on the wall. ");
		

		
	} // End method ninetyNineBottlesOfBeer

		} //End class BeerSong


