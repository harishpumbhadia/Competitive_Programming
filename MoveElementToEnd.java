import java.util.*;

class MoveElementToEnd {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
	  int i =0;
	  int j = array.size()-1;
	  while(i<j) {
		  while(i<j && array.get(j) ==toMove) j--;
		  if(array.get(i) == toMove) move(i, j, array);
			  i++;			
	  }
	  
    return  array;
  }
  
  public static void move(int i,int j , List<Integer> array) {
	  int temp = array.get(j);
	  array.set(j, array.get(i));
	  array.set(i, temp);
  }
}
