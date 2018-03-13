package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class LiczbyTest {

    @Test
    public void shouldReturnBasicPriceForSingleUser() {
        // given
        Liczby liczby = new Liczby();

        // when
        int wynik = liczby.dodaj();

        // then
        Assert.assertThat(wynik, CoreMatchers.is(23));
    //    assertThat(wynik, is(34));
    }

}
