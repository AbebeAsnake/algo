package algo.binarysearch;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binarySearch(new  int[]{1,2,3,6,45},1));

	}
public static int binarySearch(int[]a, int x) {
	int answer=-1;
	int p=0;
	int r = a.length -1;
	while(p<=r) {
		int q = (p+r)/2;
		if(a[q]==x) {
			answer = q;
             break;		
             }
		else if(a[q]>x) {
			r = q -1;
		}
		else {
		p=q+1;
		}
	}
	return answer;
}
}
