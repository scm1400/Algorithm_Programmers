import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class DartGame {
    public int solution(String dartResult) {
        ArrayList<Integer> result = new ArrayList<Integer>();        //결과 리스트
        ArrayList<String> split = new ArrayList<String>();            //패턴매칭 리스트
        
        Pattern pattern = Pattern.compile("[0-9]+[SDT][*#]?");         //하나의 단위를 추출하기 위한정규표현식
        Matcher matcher = pattern.matcher(dartResult);        
        while(matcher.find()) {
            split.add(matcher.group());                                //찾은 패턴을 split에 넣어줌
            
        }
        
        int pointer = 0;
        for(int i = 0; i < split.size(); i++) {
            int splitIdx = 0;                                                 //숫자가 0-9까지는 한 자리 수이지만 10은 두 자리수여서 유동적인 인덱스가 필요함.
            int number = Integer.parseInt(split.get(i).charAt(splitIdx)+""); //0~10
            int score = 1;                                                     //SDT
            int award = 1;                                                     //*#
            splitIdx++;                                                         //숫자를 정했으니 인덱스 + 1
            if(split.get(i).charAt(0) =='1' && split.get(i).charAt(1) =='0') {
                number = 10;
                splitIdx++;                                                     //10으로 인해 인덱스를 하나 더 사용하게 됬으므로 +1
            }
            
            
            if(split.get(i).charAt(splitIdx) == 'D') score =2;                  //SDT선언
            if(split.get(i).charAt(splitIdx) == 'T') score =3;
            splitIdx++;                                                          //SDT를 골랐으니 +1
            
            if(split.get(i).length() > splitIdx) {                              //스타상, 아차상  || 현재까지 고른 범위 보다 더 있는지 확인.
                if(split.get(i).charAt(splitIdx) == '*') award = 2;     
                if(split.get(i).charAt(splitIdx) == '#') award = -1;
            }
            
            result.add((int) (Math.pow(number, score) * award));              // number , 제곱할 수(score) * 상 종류
            if(award == 2 && pointer > 0) {
                result.set(pointer-1, result.get(pointer-1) *2);              //스타상인데 첫 번째 자리가 아니라면 이전 수도 *2해줌.
            }
            
            pointer++;
        }
        
        return result.stream().mapToInt(Integer::intValue).sum();
    }
