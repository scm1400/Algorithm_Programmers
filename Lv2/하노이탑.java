import java.util.*;
class Solution {
    ArrayList<Integer[]> arr = new ArrayList<>();
    public ArrayList<Integer[]> solution(int n) {
       
        hanoi(1,3,n);
        return arr;
    }
    
    public void hanoi(int a,int b,int n)
    {
        if(n==1)
        {
            int min = 0;
            arr.add(new Integer[] {a,b});
            return;
        }
        
        hanoi(a, 6-a-b, n-1);
        arr.add(new Integer[] {a,b});
        hanoi(6-a-b, b, n-1);    
    }
}