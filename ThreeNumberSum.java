import java.util.*;

class ThreeNumberSum {
  public static ArrayList<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
	  ArrayList<Integer[]> result = new ArrayList<Integer[]>();
	  for(int i=0;i<array.length;i++){
		  for(int j=0;j<array.length-1;j++) {
			  if(array[j]> array[j+1]) {
				  int temp;
				  temp=array[j+1];
				  array[j+1] = array[j];
				  array[j] = temp;
			  }
		  }
	  }
	  for(int i=0;i<array.length-2;i++) {
		  int leftPointer = i+1;
		  int rightPointer = array.length-1;
		  while(leftPointer < rightPointer){
			  
			  int sum = array[i]+array[leftPointer]+array[rightPointer];
			  
			  if(sum == targetSum) {
				 Integer[] newTrplet = {array[i],array[leftPointer], array[rightPointer]};
				 result.add(newTrplet);
				  leftPointer++;
				  rightPointer--;
			  }else if(sum<targetSum){
				  leftPointer++;
			  }else if(sum>targetSum) {
				  rightPointer--;
			  }
		  }
	  }
	  
   return result;
  }
}
