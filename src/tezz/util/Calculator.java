package tezz.util;

public class Calculator {
  /* Method that returns the maximum element of an array */
  static <T> T max(T[] arr) {
    if( arr.length == 0 ) 
      return 0;
    T maxValue = arr[0];
    for( int i=1; i<arr.length; i++ ) {
      if(maxValue < arr[i]) {
        maxValue = arr[i];
      }
    }
    return maxValue;
  }
}
