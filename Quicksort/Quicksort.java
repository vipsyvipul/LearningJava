// Quicksort naive method
import java.io.*;

public class Quicksort{
	private int[] a;

	public void validity(int[] a){
		if(a.length == 0 || a == null){
			return;
		}
		else{
			this.a = a;
			quickS(0, a.length-1);
		}
	}
	private void quickS(int first, int last){
		int p = a[(first+last)/2];
		int f = first;
		int l = last;
		while(f <= l){

			// Breaks when a number greater than the pivot number is found
			// which indicates it should be on the left of the pivot point
			while(a[f] < p){
				f++;
			}

			// Breaks when a number less then the pivot number is found
			// which indicates it should be on the right of the pivot number
			while(a[l] > p){
				l--;
			}

			// In case above conditions do execute to be True
			// the values should be placed in their righteous position
			// If not then the pivot number is swapped in its position
			if(f<=l){
				swap(f,l);
				f++;
				l--;
			}
		}
		// Recursion
		if(first < l)
			// Divide
			quickS(first,l);
		if(f < last)
			quickS(f,last);
	}
	private void swap(int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String args[])throws Exception{
		int[] a = {5,6,2,3,4,8,1,0,8,9};
		Quicksort qs = new Quicksort();
		qs.validity(a);
		for(int x = 0; x<a.length; x++){
			System.out.println(a[x]);
		}
	}
}
