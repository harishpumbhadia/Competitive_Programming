import java.util.*;

class ValidateSubsequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
   		int arrayIndex = 0;
		  int sequenceIndex = 0;
		  while(arrayIndex< array.size() && sequenceIndex< sequence.size()) {
			  if(sequence.get(sequenceIndex) == array.get(arrayIndex)) {
				  sequenceIndex++;
			  }
			  arrayIndex++;
		  }
		  
		  return sequenceIndex == sequence.size();
  }
}
