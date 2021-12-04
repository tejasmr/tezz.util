package tezz.util;

public class Calculator {
  /* Method that returns the maximum element of an array */
  static <T> T max(T[] arr) {
    int maxValue = Integer.MIN_VALUE;
    for( int i=0; i<arr.length; i++ ) {
      if(maxValue < arr[i]) {
        maxValue = arr[i];
      }
    }
    return maxValue;
  }
}
