package algo.recursion;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reduceByOne(3);
	}
public static void reduceByOne(int n) {
	System.out.println(n);
	if(n>=0) {	reduceByOne(n-1);}

}
}
