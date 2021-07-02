class Solution {
    public long solution(long w, long h) {
        long answer = 1;
        long size = w * h;
        long GCD = GCD(Math.max(w, h),Math.min(w, h));
        
        answer = size - GCD * (w/GCD + h/GCD -1);
        
        return answer;
    }
    
    static long GCD(long a, long b){ // 최대공약수
    	if (a%b == 0) {
    		return b;
    	}
    	return GCD(b, a % b);
    }
}