
class SmallestDifference {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
	  int[] result = new int[2];
	  int currentDifference;
	  int previousDifference = 0;
	  
	  for(int i=0; i<arrayOne.length;i++) {
		  for(int j=0;j<arrayTwo.length;j++) {
			  currentDifference = arrayOne[i]- arrayTwo[j];
			  if(currentDifference<0) {
				  currentDifference *= -1;
			  }
			  if(i==0 && j==0)
				  previousDifference = currentDifference;
			  if(currentDifference < previousDifference) {
				  result.equals(null);
				  previousDifference = currentDifference;
				  result[0] = arrayOne[i];
				  result[1]= arrayTwo[j];
			  }
			  
				  
		  }
	  }
    return result;
    
  }
}
