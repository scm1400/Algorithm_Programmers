import java.util.Stack;

class Solution
{
    public int solution(String s)
    {

        byte[] bytes = s.getBytes();
        int length = bytes.length;

        Stack<Integer> stack = new Stack<>();

        int iLeft = 0, iRight = iLeft + 1;
        for (; iLeft < length && iRight < length; ) {
            if (bytes[iLeft] == bytes[iRight]) {


                if (stack.empty()) {
                    iLeft = iRight + 1;
                    iRight = iLeft + 1;
                } else {
                    iLeft = stack.pop();
                    iRight++;
                }
            } else {
                stack.push(iLeft);

                iLeft = iRight;
                iRight = iLeft + 1;
            }
        }

        return iLeft >= length && iRight >= length ? 1 : 0;
    }
}
