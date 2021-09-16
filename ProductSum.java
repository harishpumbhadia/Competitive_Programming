import java.util.*;

class ProductSum {

  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
 public static int productSum(List<Object> array) {
    // Write your code here.
	  return productHelper(array,1);
	  }
  
  public static int productHelper(List<Object> array, int multiplier) {
	  int sum=0;
	  for(Object arr : array) {
		  if (arr instanceof ArrayList) {
			  @SuppressWarnings("unchecked")
			ArrayList<Object> damdos = (ArrayList<Object>) arr;
			  sum +=  productHelper(damdos, multiplier+1);
		  }else
			  sum += (int)arr;
	  }
	  System.out.println(sum*multiplier);
	  return sum*multiplier;
  }
}
