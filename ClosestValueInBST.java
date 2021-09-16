import java.util.*;

class ClosestValueInBST {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
		if(tree.value > target) {
			if(tree.left == null)
				return tree.value;
			else {
				return findClosestValueInBst(tree.left, target);
			}
		}
		else if(tree.value < target) {
			if(tree.right == null)
				return tree.value;
			else {
				return findClosestValueInBst(tree.right, target);
			}
		}
		else
			return tree.value;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
