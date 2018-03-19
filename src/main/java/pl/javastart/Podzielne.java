package pl.javastart;

public class Podzielne {
  public int ilosc = 20;

 /*   public static int podzielna(int ilosc) {   // też działa

        int liczba = 1;
        int wynik=1;

        for (int i = 0; i <70000; i++) {

            if ((liczba % 10) == 0 && (liczba % 9) == 0 &&(liczba % 8) == 0 &&(liczba % 7) == 0 && (liczba % 6) == 0  ) {
                wynik = liczba;
            } else liczba++;
        }
        return wynik;
    } */


  public static int podzielna() {

    int liczba = 1;

    do {
      liczba++;
    }  while ((liczba % 20) != 0 || (liczba % 19) != 0 || (liczba % 18) != 0 || (liczba % 17) != 0 || (liczba % 16) != 0 || (liczba % 16) != 0 || (liczba % 14) != 0 || (liczba % 13) != 0 || (liczba % 12) != 0 || (liczba % 11) != 0);

    return liczba;
  }
}




