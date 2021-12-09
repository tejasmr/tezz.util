package tezz.util;

/**
* Class which calculates common mathematical and algorithmic operations.
*/
public class Calculator {
  /** 
  * Method that returns the maximum element of an array 
  */
  public static <T extends Comparable<T>> T max(T[] arr) throws NoElementException {
    if( arr.length == 0 )
      throw new NoElementException();
    T maxValue = arr[0];
    for( int i=1; i<arr.length; i++ ) {
      if(maxValue.compareTo(arr[i]) < 0 ) {
        maxValue = arr[i];
      }
    }
    return maxValue;
  }
}
