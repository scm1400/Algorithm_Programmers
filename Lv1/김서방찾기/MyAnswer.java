import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {

        int at = 0;
        
        for(int i=0; i<seoul.length; i++)
        {
            if(seoul[i].equals("Kim"))
            {
                at = i;
                break;
            }
        }
        
        String answer = "김서방은 "+ at +"에 있다";
        
        // #메모 : binarysearch는 정렬된상태에서 해야하기 때문에 이 문제에 적용이 어려움
        
        return answer;
    }
}