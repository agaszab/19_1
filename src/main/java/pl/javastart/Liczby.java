package pl.javastart;

import org.springframework.stereotype.Repository;

@Repository
public class Liczby {

    public  int dodaj() {
        int liczba = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {  liczba += i; }
        }
       return liczba;
    }

}
