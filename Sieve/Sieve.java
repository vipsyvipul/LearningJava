/**
 * Seive of Erastothenes
 */

public class Sieve{

	public Sieve(int a[]){

		for(int i=0; i<120; i++){
			if(a[i]==0)
				continue;
			for(int j=i+1; j<120; j++){
				if( a[j]!=0 && a[j]%a[i]==0){
					// Filling zero for the number
					a[j]=0;
				}
				else
					continue;
			}
		}
		for (int i=0; i<a.length; i++ ) {
			// Printing only non-zero numvers
			if(a[i]!=0)
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = new int[120];
		int j=2;
		for(int i=0; i<120; i++)
			arr[i]=j++;

		Sieve eras = new Sieve(arr);
		}
	}
