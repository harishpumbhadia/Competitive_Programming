class NthFibonacci {
   public static int getNthFib(int n) {
    // Write your code here.
	  int f0=0,f1 = 1,total=0;
	  if(n==1)
		 return f0;
	  if(n==2) 
		  return f1;
	  	
	  if(n>2) {
		  
	  for(int i=0;i<n-2;i++) {
		  total = f0+f1;
		  f0=f1;
		  f1 = total;
	  }  
	  return total;
	  }
   return -1;
  }
}
