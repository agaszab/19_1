package pl.javastart;


import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> fb = new ArrayList<>();
    private int granica=4000000;

    public Fibonacci(int granica) {
        fb.add(1);
        fb.add(2);

        for (int i=2; i<granica; i++)
        {
            int n=i-1;
            int m=i-2;
            int j=fb.get(n)+fb.get(m);
            fb.add(j);
        }
    }


    public int suma(int granica){
        int suma = 0;

        for (int i=0; i<granica; i++)
        {

            if ((fb.get(i)%2)==0) suma+=fb.get(i);
        }
        return suma;
    }

    public int getGranica() {
        return granica;
    }

}
