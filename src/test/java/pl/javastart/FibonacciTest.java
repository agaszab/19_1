package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

   @Test
    public void shouldSumFor3() {
        Fibonacci fb = new Fibonacci(3);

        int wynik = fb.suma(3);

        Assert.assertThat(wynik, CoreMatchers.is(2));
    }

    @Test
    public void shouldSumFor10() {
        Fibonacci fb = new Fibonacci(10);

        int wynik = fb.suma(10);

        Assert.assertThat(wynik, CoreMatchers.is(44));
    }

    @Test
    public void shouldSumFor0() {
        Fibonacci fb = new Fibonacci(0);

        int wynik = fb.suma(0);

        Assert.assertThat(wynik, CoreMatchers.is(0));
    }

    @Test
    public void shouldSumFor15() {
        Fibonacci fb = new Fibonacci(0);

        int wynik = fb.suma(15);

        Assert.assertThat(wynik, CoreMatchers.is(798));
    }

    @Test
    public void shouldSumFor21() {
        Fibonacci fb = new Fibonacci(21);

        int wynik = fb.suma(21);

        Assert.assertThat(wynik, CoreMatchers.is(14328));
    }
}
