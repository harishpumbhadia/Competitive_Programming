import java.util.*;

class InsertionSort {
   public static int[] insertionSort(int[] array) {
    // Write your code here.
	  for(int i=0;i<array.length;i++) {
		  for(int j=0;j<i;j++) {
			  if(array[j]>array[i]) {
				  int temp;
				  temp = array[i];
				  array[i] = array[j];
				  array[j] = temp;
			  }
		  }
	  }
	  
    return array;
  }
}
