
class NoOfWaysToMakeChange {
  public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    // Write your code here.
	  int[] ways = new int[n+1];
	  ways[0] = 1;
	  for(int j=0;j<denoms.length;j++) {
		  for(int i=1;i<=n;i++) {
			  if(denoms[j]<=i) {
				  ways[i] +=ways[i-denoms[j]];
			  }
		  }
	  }
	  
    return ways[n];
  }
}

