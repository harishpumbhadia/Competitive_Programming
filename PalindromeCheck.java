
class PalindromeCheck {
  public static boolean isPalindrome(String str) {
      String reverseStr = ""; 
	 char[] string = str.toCharArray();
    // Write your code here.
	  for(int i=str.length()-1;i>-1;i--) {
		  reverseStr += string[i];
				  
	  }
	  if(str.equals(reverseStr))
		  return true;
	  else
		 return false;
}
}
