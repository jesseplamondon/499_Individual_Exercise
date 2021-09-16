import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = new int[]{1,9,7,4,5,8,2,3,1,7};
		ArrayList <Integer> res = increasingSubset(A);
		System.out.println("Sum of integers: " + Sum(A));
		System.out.print("Greatest Increasing Subset {");
		for(int e: res) {System.out.print(e+", ");}
		System.out.print("}");
	}
	// Sum feature <edit>
	public static int Sum(int[] a) {
		int sum=0;
		for(int e: a) {
			sum+=e;
		}
		return sum;
	}
	//Greatest Increasing Subset Feature <edit> <edit>
	public static ArrayList <Integer> increasingSubset(int [] A) {
		int maxSum = 0;
		ArrayList <Integer> max = new ArrayList<Integer>(Arrays.asList());
		ArrayList <Integer> localMax = new ArrayList<Integer>(Arrays.asList());
		int localSum = 0;
		for(int i = 0; i<A.length-1; i++) {
			if(A[i+1]>A[i]) {
				//add to localMax
				localMax.add(A[i]);
				localSum+=A[i];
			}
			else {
				//max = max of sum of elements in localMax and max
				localMax.add(A[i]);
				if(localSum>maxSum) {
					maxSum=localSum;
					max=localMax;
				}
				//reset localMax
				localMax = new ArrayList<Integer>(Arrays.asList());
				localSum = 0;
			}
		}
		return max;
	}

}
