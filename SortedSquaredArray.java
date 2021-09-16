import java.util.*;

class  SortedSquaredArray{
		public static int[] sortedSquaredArray(int[] array) {
	    // Write your code here.
			int[] newArray = new int[array.length];
			for(int i = 0 ; i<array.length; i++){
				newArray[i] = array[i] * array[i];
			}
			int counter = 1;
			boolean sorted = false;
			while(!sorted) {
				sorted = true;
				for(int i = 0 ; i<newArray.length-counter; i++) {
					if(newArray[i]> newArray[i+1]) {
						int temp = newArray[i];
						newArray[i] = newArray[i+1];
						newArray[i+1] = temp;
						sorted = false;
					}
				}
				counter++;
			}
			
	    return newArray;
	  }
}
