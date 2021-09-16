
class FirstDuplicateValue {

  public static int firstDuplicateValue(int[] array) {
    // Write your code here.
	  for(int i=0;i<array.length;i++) {
		  for(int j=0;j<i;j++) {
			  if(array[i] == array[j])
				  return array[i];
		  }
	  }
    return -1;
  }
}

