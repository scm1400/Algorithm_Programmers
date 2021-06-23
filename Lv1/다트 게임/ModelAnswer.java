import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class DartGame {
    public int solution(String dartResult) {
        ArrayList<Integer> result = new ArrayList<Integer>();        //��� ����Ʈ
        ArrayList<String> split = new ArrayList<String>();            //���ϸ�Ī ����Ʈ
        
        Pattern pattern = Pattern.compile("[0-9]+[SDT][*#]?");         //�ϳ��� ������ �����ϱ� ��������ǥ����
        Matcher matcher = pattern.matcher(dartResult);        
        while(matcher.find()) {
            split.add(matcher.group());                                //ã�� ������ split�� �־���
            
        }
        
        int pointer = 0;
        for(int i = 0; i < split.size(); i++) {
            int splitIdx = 0;                                                 //���ڰ� 0-9������ �� �ڸ� �������� 10�� �� �ڸ������� �������� �ε����� �ʿ���.
            int number = Integer.parseInt(split.get(i).charAt(splitIdx)+""); //0~10
            int score = 1;                                                     //SDT
            int award = 1;                                                     //*#
            splitIdx++;                                                         //���ڸ� �������� �ε��� + 1
            if(split.get(i).charAt(0) =='1' && split.get(i).charAt(1) =='0') {
                number = 10;
                splitIdx++;                                                     //10���� ���� �ε����� �ϳ� �� ����ϰ� �����Ƿ� +1
            }
            
            
            if(split.get(i).charAt(splitIdx) == 'D') score =2;                  //SDT����
            if(split.get(i).charAt(splitIdx) == 'T') score =3;
            splitIdx++;                                                          //SDT�� ������� +1
            
            if(split.get(i).length() > splitIdx) {                              //��Ÿ��, ������  || ������� �� ���� ���� �� �ִ��� Ȯ��.
                if(split.get(i).charAt(splitIdx) == '*') award = 2;     
                if(split.get(i).charAt(splitIdx) == '#') award = -1;
            }
            
            result.add((int) (Math.pow(number, score) * award));              // number , ������ ��(score) * �� ����
            if(award == 2 && pointer > 0) {
                result.set(pointer-1, result.get(pointer-1) *2);              //��Ÿ���ε� ù ��° �ڸ��� �ƴ϶�� ���� ���� *2����.
            }
            
            pointer++;
        }
        
        return result.stream().mapToInt(Integer::intValue).sum();
    }
