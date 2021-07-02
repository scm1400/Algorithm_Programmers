import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    static int picCnt;
    public int[] solution(int m, int n, int[][] picture) {

        boolean[][] used = new boolean[m][n];

        int[] answer = new int[2];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(picture[i][j] > 0 && !used[i][j]) {
                    picCnt = 0;
                    answer[0]++;
                    seek(picture, used, picture[i][j], i, j, m, n);
                    pq.add(picCnt);
                }
            }
        }
        
       
        answer[1] = pq.poll();
        return answer;
    }
    public void seek(int[][] p,boolean[][] used, int num, int x, int y,int m,int n)
    {
        if(used[x][y] || p[x][y] != num) return;
        picCnt++;
        used[x][y] = true;
        
        if(0 <= x-1) {
            seek(p,used,num, x-1, y, m, n);
        }
        if(x+1 < m) {
            seek(p,used,num, x+1, y, m, n);
        }
        if(0 <= y-1) {
            seek(p,used,num, x, y-1, m, n);
        }
        if(y+1 < n) {
            seek(p,used,num, x, y+1, m, n);
        }

    		
    	return;
    }
}