package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class RoznicaKwadratowTest {
    RoznicaKwadratow roznicaKwadratow=new RoznicaKwadratow();

    @Test
    public void shouldRoznicaFor10() {
        int wynik = roznicaKwadratow.roznicaKwadratow(10);
        Assert.assertThat(wynik, CoreMatchers.is(2640));
    }

    @Test
    public void shouldRoznicaFor2() {
        int wynik = roznicaKwadratow.roznicaKwadratow(2);
        Assert.assertThat(wynik, CoreMatchers.is(4));
    }

    @Test
    public void shouldRoznicaFor5() {
        int wynik = roznicaKwadratow.roznicaKwadratow(5);
        Assert.assertThat(wynik, CoreMatchers.is(170));
    }
}
