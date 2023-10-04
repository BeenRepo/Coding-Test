class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        String[] dart = dartResult.split("");
        int index = -1;

        for(int i = 0; i<dart.length;i++){
            if(dart[i].matches("[0-9]")){
                index++;
                score[index] = Integer.parseInt(dart[i]);
                if(dart[i+1].matches("[0-9]")){
                    score[index] *= 10;
                    i++;
                }
            }
            switch(dart[i]){
            case "D" :
                score[index] = (int)Math.pow(score[index],2);
                break;
            case "T" :
                score[index] = (int)Math.pow(score[index],3);
                break;
            case "*" :
                if(index != 0)
                    score[index-1] *= 2;
                score[index] *= 2;
                break;
            case "#" :
                score[index] *= -1;
            }
        }
        for(int i = 0; i<score.length;i++){
            answer += score[i];
        }
         return answer;
    }

    }