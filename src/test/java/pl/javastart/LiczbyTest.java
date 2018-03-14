package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class LiczbyTest {

    @Test
    public void shouldSumFor10() {
        Liczby liczby = new Liczby();
        int sumaDo=10;

        int wynik = liczby.dodaj(sumaDo);

        Assert.assertThat(wynik, CoreMatchers.is(23));
    }


    @Test
    public void shouldSumFor25() {
        Liczby liczby = new Liczby();
        int sumaDo=25;

        int wynik = liczby.dodaj(sumaDo);

        Assert.assertThat(wynik, CoreMatchers.is(543));
    }

    @Test
    public void shouldSumFor50() {

        Liczby liczby = new Liczby();
        int sumaDo=50;

        int wynik = liczby.dodaj(sumaDo);

        Assert.assertThat(wynik, CoreMatchers.is(543));
    }
}
