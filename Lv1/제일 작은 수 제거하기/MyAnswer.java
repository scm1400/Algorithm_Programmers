
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
//arr 에서 가장 작은 수를 제거한 배열을 리턴
//배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴