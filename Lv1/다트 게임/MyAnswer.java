import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {
        
        Pattern p = Pattern.compile("[0-9]{1,2}[S|D|T][*|#]{0,1}");
        Matcher m = p.matcher(dartResult);
        
        int score = 0; 
        int temp = 0;
		int pv_num = 0;

        while(m.find())
        {       		
        		String a[] = m.group().split("[S|D|T]");
        		
        		int minus = 1;
        		int plus = 1;

        		
        		if(m.group().contains("T") )
        		{
        			temp = 3;
        		}
        		else if(m.group().contains("D"))
        		{
        			temp = 2;
        		}
        		else temp = 1;
        		
        		if(m.group().contains("#") )
        		{
        			minus = -1;
        		}
        		else if(m.group().contains("*"))
        		{
        			score += pv_num;
        			plus = 2;
        			
        		}
        		
        		score += Math.pow( Integer.parseInt(a[0]), temp)*minus*plus ;
        		//b = score - b
        		System.out.println(score);

        		pv_num =  score - pv_num * plus;
       		
        }
        
        
        return score;
    }
}

//��Ʈ ������ �� 3���� ��ȸ�� �����ȴ�.
//�� ��ȸ���� ���� �� �ִ� ������ 0������ 10�������̴�.
//������ �Բ� Single(S), Double(D), Triple(T) ������ �����ϰ� �� ���� ��÷ �� �������� 1����, 2����, 3���� (����1 , ����2 , ����3 )���� ���ȴ�.
//�ɼ����� ��Ÿ��(*) , ������(#)�� �����ϸ� ��Ÿ��(*) ��÷ �� �ش� ������ �ٷ� ���� ���� ������ �� 2��� �����. ������(#) ��÷ �� �ش� ������ ���̳ʽ��ȴ�.
//��Ÿ��(*)�� ù ��° ��ȸ������ ���� �� �ִ�. �� ��� ù ��° ��Ÿ��(*)�� ������ 2�谡 �ȴ�. (���� 4�� ����)
//��Ÿ��(*)�� ȿ���� �ٸ� ��Ÿ��(*)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ��Ÿ��(*) ������ 4�谡 �ȴ�. (���� 4�� ����)
//��Ÿ��(*)�� ȿ���� ������(#)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ������(#)�� ������ -2�谡 �ȴ�. (���� 5�� ����)
//Single(S), Double(D), Triple(T)�� �������� �ϳ��� �����Ѵ�.
//��Ÿ��(*), ������(#)�� �������� �� �� �ϳ��� ������ �� ������, �������� ���� ���� �ִ�.