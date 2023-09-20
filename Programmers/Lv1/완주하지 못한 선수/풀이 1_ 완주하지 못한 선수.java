import java.util.*;

class Solution{
	public String solution(String[] participant, String[] completion) {
        	String answer = "";
HashMap<String,Integer> completionMap = new HashMap<>();

        for(String s : completion){
            if(!completionMap.containsKey(s))
                completionMap.put(s,1);
            else
                completionMap.put(s,(completionMap.get(s))+1);
        }
        for(String s : participant){
            if(completionMap.get(s)!=null){
                completionMap.put(s,(completionMap.get(s))-1);
                if(completionMap.get(s)==-1)
                    answer=s;
            }
            else
                answer=s;
        }
        return answer;
	}

}