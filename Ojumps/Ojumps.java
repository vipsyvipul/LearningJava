import java.io.*;
import java.lang.*;

class Ojumps{
	public static void main(String args[])throws IOException{
		long a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Long.parseLong(br.readLine());
		a = a%6;
		if(a==0 || a==1 || a==3){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
