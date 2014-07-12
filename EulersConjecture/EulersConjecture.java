public class EulersConjecture
{
	public static void main(String[] args)
	{
		long a, b, c, d, e;
		double powA, powB, powC, powD, powE, sum;
		a = b = c = d = e = 1;
		int flag = 0;

		while(flag == 0)
		{
			powA = Math.pow(a,5);
			while(flag == 0)
			{
				powB = Math.pow(b,5);
				while(flag == 0)
				{
					powC = Math.pow(c,5);
					while(flag == 0)
					{
						powD = Math.pow(d,5);
						while(flag == 0)
						{
							powE = Math.pow(e,5);
							sum = powA + powB + powC + powD;
							if(sum == powE)
							{
								flag = 1;
								System.out.println("Success");
								System.out.format(a + "^5+" + b + "^5+" + c + "^5+" + d + "^5 = " + e + "^5");
							}
							e++;
						}
						d++;
					}
					c++;
				}
				b++;
			}
			a++;
		}
	}
}