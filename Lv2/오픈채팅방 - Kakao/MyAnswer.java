import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<String> solution(String[] record) {

        ArrayList<String> answer = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (String s : record) {
            String[] split = s.split(" ");
            String id = split[1];
            String act = split[0];
            if (!act.equals("Leave")) {
                String nick = split[2];
                map.put(id, nick);
            }
        }

        for (String s : record) {

            String[] split = s.split(" ");
            String id = split[1];
            String act = split[0];
            StringBuilder log = new StringBuilder();

            if (act.equals("Enter")) {
                log.append(map.get(id) + "님이 들어왔습니다.");
                answer.add(log.toString());
            } else if (act.equals("Leave")) {
                log.append(map.get(id) + "님이 나갔습니다.");
                answer.add(log.toString());
            }

        }

        return answer;
    }
}