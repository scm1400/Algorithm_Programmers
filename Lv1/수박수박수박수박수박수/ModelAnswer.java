public class WaterMelon {
    public String watermelon(int n){
    StringBuffer sb = new StringBuffer();
        for (int index = 1; index <= n; index++) {
      sb.append(((index % 2) == 1) ? "수" : "박");
    }

        return sb.toString();
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}