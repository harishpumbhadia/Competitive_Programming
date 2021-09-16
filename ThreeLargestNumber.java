class ThreeLargestNumber {
  public static int[] findThreeLargestNumbers(int[] array) {
     
	  int[] result = new int[3];
	  for(int count=0;count<3;count++) {
		  for(int i=0;i<array.length-1;i++) {
			  if(array[i]> array[i+1]) {
				  int temp;
				  temp = array[i+1];
				  array[i+1] = array[i];
				  array[i] = temp;
			  }
		  }
	  }
	  
	 for(int j=0;j<array.length-1;j++) {
		 result[0] = array[array.length-3];
		 result[1] = array[array.length-2];
		 result[2] = array[array.length-1];
	 }
	  return result;
  }
}
