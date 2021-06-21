class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int length = nums.length;
        int count = 0;

        for(int i = 0; i < length; i++)
        {
            if((i+2) == length) break;
            for(int j = i+1; j < length; j++)
            {
                for(int k = j+1; k < length; k++)
                {
                        for(int l = 1; l <= (nums[i]+nums[j]+nums[k]); l++)
                        {
                            if((nums[i]+nums[j]+nums[k]) % l == 0)
                            {
                                count++;
                            }
                        }
                        if(count == 2)
                        {
                            answer++;
                        }
                        count = 0;
                }
            }
        }

        return answer;
    }
}