import java.util.*;

class ArrayOfProduct {
  public static int[] arrayOfProducts(int[] array) {
    // Write your code here.
	
	  int[] result = new int[array.length];
	  for(int i=0;i<array.length;i++) {
		  int multiplication = 1;
		  for(int j=0;j<array.length;j++) {
			  if(i!=j) {
				  multiplication *=array[j];
			  }
		  }
		  result[i] = multiplication;
	  }
	  
    return result;
  }
}