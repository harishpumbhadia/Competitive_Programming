
class Program {
    public static int binarySearch(int[] array, int target) {
    // Write your code here.
	  int leftPointer = 0;
	  int rightPointer = array.length-1;
	  int middlePointer = 0;
	  int count = 0;
	  for(int i =0 ; i< array.length-1;i++) {
		  middlePointer = (leftPointer+rightPointer)/2;
		  if(array[middlePointer] != target) {
			  if(array[middlePointer]<target) {
				  leftPointer = middlePointer+1;
			  }
			  if(array[middlePointer]>target)
				  rightPointer = middlePointer-1;
		  }
		  else {
			  count ++;
			  return middlePointer;
		  }
	  }
	  if(count ==0)
		  return -1;
	  else
		  return middlePointer;
  }
}
