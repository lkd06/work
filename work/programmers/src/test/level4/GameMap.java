package test.level4;
 
import java.util.*;

public class GameMap {
	class Point{
		public int x,y,count;
		public Point(int x,int y,int count) {
			this.x=x;
			this.y=y;
			this.count=count;
		}
	}
	public int solution(int[][] maps) {
		Queue<Point> st = new LinkedList<>();
		int n=maps.length,m=maps[0].length;
		st.add(new Point(0, 0, 1));
		int x[] = {-1,0,1,0};
		int y[] = {0,1,0,-1};
		maps[0][0]=0;
		while(!st.isEmpty()) {
			Point next = st.poll();
			for(int i=0;i<4;i++) {
				if(next.x+x[i]>=0 &&next.x+x[i]<n && next.y+y[i]>=0 &&next.y+y[i]<m) {
					if(next.x+x[i]==n-1 && next.y+y[i]==m-1) {
                        return next.count+1;
					}else if(maps[next.x+x[i]][next.y+y[i]]==1){
						maps[next.x+x[i]][next.y+y[i]]=next.count+1;
					    st.add(new Point(next.x+x[i], next.y+y[i], next.count+1));
                    }
				}
			}
		}
		return -1;
	}
}

	
