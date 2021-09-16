
class MaxSubsetSum {
 public static int maxSubsetSumNoAdjacent(int[] array) {
    // Write your code here.
	  int[] maxSums = new int[array.length];
	  
	 
	  if(array.length == 0)
		  return 0;
	  if(array.length == 1)
		  maxSums[0] = array[0];
	 else if(array.length>1){
		 if(array[0]> array[1]){
			 maxSums[0] = array[0];
			 maxSums[1] = array[0];
		 }else{
			 maxSums[0] = array[0];
		 	 maxSums[1] = array[1];
	 }
	  for(int i=2;i<array.length;i++) {
		 		
			  if(maxSums[i-1]>maxSums[i-2]+array[i]) {
				  maxSums[i] = maxSums[i-1];
			  }else {
				  maxSums[i] = maxSums[i-2]+array[i];
			  }
		}
		}
    return maxSums[array.length-1];
  }

}
