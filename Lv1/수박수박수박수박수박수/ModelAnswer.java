public class WaterMelon {
    public String watermelon(int n){
    StringBuffer sb = new StringBuffer();
        for (int index = 1; index <= n; index++) {
      sb.append(((index % 2) == 1) ? "��" : "��");
    }

        return sb.toString();
    }

    // ������ ���� �׽�Ʈ�ڵ��Դϴ�.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n�� 3�� ���: " + wm.watermelon(3));
        System.out.println("n�� 4�� ���: " + wm.watermelon(4));
    }
}