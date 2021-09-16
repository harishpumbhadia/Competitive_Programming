
class RunLengthEncoding {
  public static String runLengthEncoding(String string) {
     StringBuilder encodedString = new StringBuilder();
	  int count = 1;
	  if(string == "")
		  return "";
	  for(int i=1;i<string.length();i++) {
		 char currentLetter  = string.charAt(i);
		 char previousLetter = string.charAt(i-1);
		   if(previousLetter != currentLetter || count==9) {
			   encodedString.append(Integer.toString(count));
			   encodedString.append(previousLetter);
			   count = 0;
		   }
		 
		   count++;
	  }
	  encodedString.append(Integer.toString(count));
	  encodedString.append(string.charAt(string.length()-1));
	  return encodedString.toString();
  }
}
