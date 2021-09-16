import java.util.*;

	class BranchSum {
		  
	  public static class BinaryTree {
	    int value;
	    BinaryTree left;
	    BinaryTree right;

	    BinaryTree(int value) {
	      this.value = value;
	      this.left = null;
	      this.right = null;
	    }
	  }
	  
	  public static List<Integer> branchSums(BinaryTree root) {
		  List<Integer> result = new ArrayList<Integer>();
		  calculate(root, 0, result);
		  return result;
		  	    
	  }
	  public static void calculate(BinaryTree Node, int runningSum, List<Integer> sum) {
			if(Node == null) return;
			
		  int newRunningSum = runningSum + Node.value;
		  if(Node.left == null && Node.right == null) {
			  sum.add(newRunningSum);
			  return;
		  }
			
		  calculate(Node.left, newRunningSum, sum);
		  calculate(Node.right, newRunningSum, sum);
		  
	  }
	}
