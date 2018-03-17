package algo.recursion;

public class linearrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(linearSearch(new  int[]{1,2,3,5,6},1,5));
	}
public static int linearSearch(int[]a,int i , int x) {
	int n = a.length -1;
	if(i>n) {return -1;}
	else if(a[i]==x) {return i;}
	else {
		//System.out.println(i);
		return linearSearch(a,i+1,x);
	}
}
}
