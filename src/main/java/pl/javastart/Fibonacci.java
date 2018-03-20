package pl.javastart;


public class Fibonacci {

    private long granica=4000000;

    public long sumaFibonacci(long granica) {
        long a=0;
        long b=1;
        long c=a+b;
        long suma=0;

        while (c <= granica)    {

            if (c % 2 == 0)   { suma += c;    }
            a = b;
            b = c;
            c = a + b;
        }
        return suma;
    }


    public long getGranica() {
        return granica;
    }


}
