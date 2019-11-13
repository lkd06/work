package test.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Num {
	public int[] solution(int[] arr, int divisor) {
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) list.add(arr[i]);
		}
		
		if(list.size()==0) list.add(-1);
		int[] answer=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
		return answer;
	}
	
	public long sum(int a,int b,long answer) {
		for(int i=a;i<=b;i++) {
			answer+=i;
		}
	}
	
	public long solution(int a, int b) {
	      long answer = 0;
	      String str="가나다";
	      return answer;
	}
}
//주석처리해도 한글 인식 안 되나
//주석처리하면 한글 인식 가능
//그냥 ~.java는 한글 인식 되는 듯
