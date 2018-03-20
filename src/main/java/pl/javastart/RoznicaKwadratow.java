package pl.javastart;

public class RoznicaKwadratow {
    int limit=100;
    int suma=0;
    int kwadrat;

    public int roznicaKwadratow(int limit){
        return kwadratSumy(limit)-sumaKwadratow(limit);
    }


    public int getLimit() {
        return limit;
    }

    public int kwadratSumy(int limit) {

        for (int i = 1; i <= limit; i++) {
            suma+=i;
        }
        return kwadrat=suma*suma;

    }

    public int sumaKwadratow(int limit) {
        suma=0;
        for (int i = 1; i <= limit; i++) {
        suma+=(i*i);
        }
     return suma;
    }
}
