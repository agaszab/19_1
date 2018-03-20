package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    Fibonacci fb = new Fibonacci();

   @Test
    public void shouldSumFor3() {
        long wynik = fb.sumaFibonacci(3);
        Assert.assertThat(wynik, CoreMatchers.is(2L));
    }

    @Test
    public void shouldSumFor10() {
        long wynik = fb.sumaFibonacci(10);
        Assert.assertThat(wynik, CoreMatchers.is(10L));
    }

    @Test
    public void shouldSumFor4000() {
        long wynik = fb.sumaFibonacci(0);
        Assert.assertThat(wynik, CoreMatchers.is(0L));
    }

    @Test
    public void shouldSumFor15() {
        long  wynik = fb.sumaFibonacci(15);
        Assert.assertThat(wynik, CoreMatchers.is(10L));
    }

    @Test
    public void shouldSumFor21() {
        long wynik = fb.sumaFibonacci(21);
        Assert.assertThat(wynik, CoreMatchers.is(10L));
    }

    @Test
    public void shouldSumFor1000() {
        long wynik = fb.sumaFibonacci(1000);
        Assert.assertThat(wynik, CoreMatchers.is(798L));
    }
}
