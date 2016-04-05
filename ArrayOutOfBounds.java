package Com.Exception.Classes;
//This program has been written to show the usage of array out of bounds exception.
public class ArrayOutOfBounds {

	public static void main(String[] args) {
		
		int intArray[] = {1,2,3,4,5 };				//Declaring and initialization of array.
		
		for(int i=0;i < 5; i++)						// For loop to print array elements.
		{
			System.out.print(intArray[i] + " ");	//Command to print array elements.
		}
		
		int intIndex = 7;							// Declaring and initialization of a variable.
		System.out.println("");						// Command to create a line space between two outputs. 
		
		try											// Try block to catch error.
		{
			System.out.println(intArray[intIndex]); // Trying to axis the index which does not exist. 
		}catch (ArrayIndexOutOfBoundsException e)	//Catching an error for out of bounds.
		{
			System.out.println("The array is of length 5 but you are trying to axis " + intIndex + " which does not exist."); //Printing the error.
		}
	}
}
