
class Solution {
    public int[] solution(int[] arr) {
       	int[] answer = new int[arr.length == 1 ? 1 : arr.length-1];
        
		if (arr.length == 1) 
		{
			answer[0] = -1;
			return answer;
		} 
		else 
		{
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[i] <= min)
					min = arr[i];
			}

			int index = 0;
			for (int i : arr) 
			{
				if (min != i) 
				{
					answer[index] = i;
					index++;
				}
			}
		}
        
        return answer;
    }
}
//arr ���� ���� ���� ���� ������ �迭�� ����
//�迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� ����