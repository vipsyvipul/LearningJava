/**
 *Question 1.2.25
 *Wind chill. Given the temperature t (in Fahrenheit) and the wind
 *speed V(in miles per hour), the National Weather Service
 *defines the effective temperature (the wind chill) to be:
 *w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v^0.16
 *Write a program that takes two double command-line arguments
 *t and v and prints out the wind chill.
 *Use Math.pow(a, b) to compute ab. Note:The formula is
 *not valid if t is larger than 50 in absolute value or if
 *v is larger than 120 or less than 3
 *(you may assume that the valuesyou get are in that range).
 *
 * @author Vipul Bansal
 * @param t v
 */


public class WindChill
{
	public static void main(String[] args)
	{
		double t,v,w;
		t = Integer.parseInt(args[0]); //Reading temperature value
		v = Integer.parseInt(args[1]); //Reading the speed value

		if(Math.abs(t) <= 50 && v<120 && v>3)
		{
			w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v,0.16);
			System.out.format("The Wind Chill is %2.2f",w);
		}
		else
			System.out.println("Invalid Ranges");
	}
}