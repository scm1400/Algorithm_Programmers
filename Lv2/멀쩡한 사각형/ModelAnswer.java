
import java.math.BigInteger;

public class Solution {

    public long solution(int w, int h) {
        long totalCount = (long) w * (long) h;
        long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();
  
        return totalCount - diagonalCount;
    }
}