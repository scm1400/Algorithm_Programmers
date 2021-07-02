
import java.util.*;


class Solution {

	static int[] dx = new int[] {-1,1,0,0};
	static int[] dy = new int[] {0,0,-1,1};
	static boolean[][] used;
	
    public int[] solution(int m, int n, int[][] picture) {

        used = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        int[] answer = new int[2];
        for(int i = 0; i <m; i++)
        {
        	for(int j = 0; j <n; j++)
        	{
        		if(!used[i][j] && picture[i][j]!=0)
        		{
        			maxSizeOfOneArea = BFS(i, j, picture);
        			numberOfArea++;
        		}
        	}
        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

	static int BFS(int x, int y, int[][] picture) {
		Queue<int[]> q = new LinkedList<>();
        used[x][y] = true;
        q.add(new int[]{x,y,picture[x][y]});
        int areaSize = 1;
        
        while(!q.isEmpty())
        {
        	int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
    		int color = cur[2];
        	for(int i = 0; i < 4; i++)
        	{
        		int nx = cx + dx[i];
        		int ny = cy + dy[i];

        		if(nx <0 || nx >= picture.length || ny >= picture[0].length || ny <0) continue;
        		
        		if(!used[nx][ny] && picture[nx][ny] == color) 
        		{
        			used[nx][ny] = true;
        			q.add(new int[]{nx,ny,picture[nx][ny]});
        			areaSize ++;
        		}
        	}
        }
        return areaSize;
	}
}
//    public void seek(int[][] p, int num, int x, int y,int m,int n)
//    {
//    	if(used[x][y]) return;
//    	used[x][y] = true;
//    	
//    	for(int i = 0; i < 4; i++)
//    	{
//
//    	}
//    		
//    	return;
//    }
