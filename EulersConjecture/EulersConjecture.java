public class EulersConjecture {

   public static void main(String[] args) { 
      long N = Long.parseLong(args[0]);
      long a5, b5, c5, d5, e5;

      for (long e = 1; e <= N; e++) {
         e5 = e*e*e*e*e;

         // restrict search to a <= b <= c <= d <= e for efficiency
         for (long a = 1; a <= N; a++) {
            a5 = a*a*a*a*a;
            if (a5 + a5 + a5 + a5 > e5) break;

            for (long b = a; b <= N; b++) {
               b5 = b*b*b*b*b;
               if (a5 + b5 + b5 + b5 > e5) break;

               for (long c = b; c <= N; c++) {
                  c5 = c*c*c*c*c;
                  if (a5 + b5 + c5 + c5 > e5) break;

                  for (long d = c; d <= N; d++) {
                     d5 = d*d*d*d*d;
                     if (a5 + b5 + c5 + d5  > e5) break;
                     if (a5 + b5 + c5 + d5 == e5)
                        System.out.println(a + "^5 + " + b + "^5  + " + c + "^5 + " + d + "^5 = " + e + "^5"); 
                  }
               }
            }
         }
      }
   }
}