class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
            for(int i = 1; i <= num/2; i++){
        if(num%i == 0) answer += i;
      }
        return answer+num;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        SumDivisor c = new SumDivisor();
        System.out.println(c.sumDivisor(12));
    }
}
