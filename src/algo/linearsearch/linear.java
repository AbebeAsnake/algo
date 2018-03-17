package algo.linearsearch;

public class linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(linearSearch(new  int[]{1,2,3,45,6},2));

	}
	public static int linearSearch(int[]a, int x) {
		int answer = -1;
	   int n = a.length;
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
				answer = i;
			}
		}
		return answer;
	}

}
