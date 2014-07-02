/**
 * Question: 1.2.32 Color Conversion
 * @author Vipul Bansal
 * @param r,g,b Color values
 */
public class RGBtoCMYK
{
	public static void main(String[] args)
	{
		double r,g,b;
		double w,c,m,y,k;
		r = Integer.parseInt(args[0]);
		g = Integer.parseInt(args[1]);
		b = Integer.parseInt(args[2]);

		// Check if r=g=b=0
		if( r==0 && g==0 && b==0)
		{
			c=m=y=0;
			k=1;
		}
		else
		{
			double r1 = r/255;
			double g1 = g/255;
			double b1 = b/255;
			// Find the largest number
			if(r1>=g1 && r1>=b1)
				w = r1;
			else if(g1>=r1 && g1>=b1)
				w = g1;
			else w = b1;
			System.out.println("w = "+w);
			c = (w - r1)/w;
			m = (w - g1)/w;
			y = (w - b1)/w;
			k = 1 - w;
		}

		// Print CMYK values
		System.out.format("The corresponding values for %.1f, %.1f, %.1f are: ",r,g,b);
		System.out.println();
		System.out.format("C=%.3f M=%.3f Y=%.3f K=%.3f",c,m,y,k);
	}
}