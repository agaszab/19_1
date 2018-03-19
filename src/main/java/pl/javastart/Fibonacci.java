package pl.javastart;


public class Fibonacci {

    private long granica=4000000;

    public long sumaFibonacci(long granica) {
        long a=1;
        long b=1;
        long c=a+b;
        long suma=2;


        while (suma-c<granica)
        {
           a=b;
           b=c;
           c=a+b;

               if ((c % 2) == 0) {
                   suma += c;
               }

           System.out.println("suma: "+suma);
        }
        return suma-c;
    }


    public long getGranica() {
        return granica;
    }


}
