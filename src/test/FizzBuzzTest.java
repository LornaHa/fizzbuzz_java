import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void printsAllOtherNumbers() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(1)).isEqualTo("1");
    }

    @Test
    public void printFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void printFizzOnly() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(3)).isEqualTo("Fizz");
    }
}
