package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class PodzielneTest {

    @Test
    public void podzielna3() {
        int liczba = 1;
        do {liczba++;
        } while ( (liczba % 3) != 0 || (liczba % 2) != 0) ;

        Assert.assertThat(liczba, CoreMatchers.is(6));

    }
    @Test
    public void podzielna4() {
        int liczba = 1;
        do {liczba++;
        } while ( (liczba % 4) != 0 || (liczba % 3) != 0) ;

        Assert.assertThat(liczba, CoreMatchers.is(12));

    }


}