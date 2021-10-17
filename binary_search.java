/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Recursion
{/**
 * Search in the array A in positions numbered loIndex to hiIndex,
 * inclusive, for the specified value.  If the value is found, return 
 * the index in the array where it occurs.  If the value is not found, 
 * return -1.  Precondition:  The array must be sorted into increasing 
 * order.
 */
static int binarySearch(int[] A, int loIndex, int hiIndex, int value) {
      
   if (loIndex > hiIndex) {
         // The starting position comes after the final index,
         // so there are actually no elements in the specified
         // range.  The value does not occur in this empty list!
      return -1;
   }
   
   else {
         // Look at the middle position in the list.  If the
         // value occurs at that position, return that position.
         // Otherwise, search recursively in either the first
         // half or the second half of the list.
      int middle = (loIndex + hiIndex) / 2;
      if (value == A[middle])
         return middle;
      else if (value < A[middle])
         return binarySearch(A, loIndex, middle - 1, value);
      else   // value must be > A[middle]
         return binarySearch(A, middle + 1, hiIndex, value);
   }

} // end binarySearch()
	public static void main(String[] args) {
	    int[] arr={1,3,5,7,8,10};//array to be searched
	    int result=binarySearch(arr,0,5,5);//call binarySearch
		System.out.println(result);//returns index of searched value
	}
}
