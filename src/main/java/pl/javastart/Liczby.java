package pl.javastart;

import org.springframework.stereotype.Repository;

@Repository
public class Liczby {

private int sumaD0=1000;

    public  int dodaj(int sumaD0) {
        int liczba = 0;
        for (int i = 1; i < sumaD0; i++) {
            if (i % 3 == 0 || i % 5 == 0) {  liczba += i; }
        }
       return liczba;
    }

    public int getSumaDo() {
        return sumaD0;
    }
}
