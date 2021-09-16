
class CaesarCipherEncryptor {
   public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here
	  int newKey = key%26;
	  String result = "";
	  if(key<0)
		  return "";
	  
	 for(int i=0;i<str.length();i++) {
		 char letter = str.charAt(i);
		 int newLetter = letter + newKey;
		 if(newLetter > 122) {
			 newLetter = newLetter%122;
			 newLetter += 96;
			 
		 } 
		  result = result+(char)newLetter;
	 }
	  return result;
  }
}
