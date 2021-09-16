
class MonotonicArray {
  public static boolean isMonotonic(int[] array) {
    // Write your code here.
	  int increasingcount=0;
	  int decreasingCount = 0;
	  
	  for(int i=0;i<array.length-1;i++) {
		  if(array[0]<= array[1]) {
			  if(array[i]<= array[i+1])
				  increasingcount++;
		  }
		  if(array[0] >= array[1]) {
			  if(array[i] >= array[i+1])
				  decreasingCount++;
		  }
	  }
	  
	  if(increasingcount == array.length-1 || decreasingCount== array.length-1|| array.length==0) 
		  return true;
	  else 
		  return false;
  }
}
