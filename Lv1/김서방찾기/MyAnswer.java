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
        
        String answer = "�輭���� "+ at +"�� �ִ�";
        
        // #�޸� : binarysearch�� ���ĵȻ��¿��� �ؾ��ϱ� ������ �� ������ ������ �����
        
        return answer;
    }
}