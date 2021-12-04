package tezz.util;

public class Calculator {
  /* Method that returns the maximum element of an array */
  static <T extends Comparable<T>> T max(T[] arr) throws RuntimeException {
    if( arr.length == 0 ) 
      throw new RuntimeException("Array can not be empty");
    T maxValue = arr[0];
    for( int i=1; i<arr.length; i++ ) {
      if(maxValue.compareTo(arr[i]) < 0 ) {
        maxValue = arr[i];
      }
    }
    return maxValue;
  }
}
