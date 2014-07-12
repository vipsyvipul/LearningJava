public class TimeAngle{

		// Computation variables
		double hm;

	public TimeAngle(double h, double m){

		// Check if valid numbers
		if ( h<0 || m<0 || h>12 || m>59) {
			System.out.println("Invalid Numbers");
		}else{

		hm = Math.abs(((h*60 + m)*0.5) - (6*m));
		}
	}

	public static void main(String[] args) {
			
		double h = Double.parseDouble(args[0]);
		double m = Double.parseDouble(args[1]);
	
		TimeAngle time = new TimeAngle(h,m);
		if(time.hm != 0)
		System.out.println(time.hm);
	}
}