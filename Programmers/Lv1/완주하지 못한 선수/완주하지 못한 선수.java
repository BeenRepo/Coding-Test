import java.util.*;

class Solution{
	public String solution(String[] participant, String[] completion) {
        	String answer = "";
			HashSet<String> completionSet = new HashSet<>();

			for(String s : completion){
					completionSet.add(s);
			}
			for(String s : participant){
                
				if(completionSet.contains(s))
					completionSet.remove(s);
                else
                    answer = s;
			}	
        return answer;
	}

}