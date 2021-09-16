
class SelectionSort {
  public static int[] selectionSort(int[] array) {
    // Write your code here.
	  for(int i=0;i<array.length;i++) {
		  for(int j=i+1;j<array.length;j++) {
			  if(array[j]<array[i])  {
				  int temp;
				  temp = array[i];
				  array[i]=array[j];
				  array[j] = temp;
			  }

		  }
		
	  }
	  
    return array;
  }
}
