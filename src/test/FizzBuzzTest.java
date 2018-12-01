import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void printsAllOtherNumbers(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(1)).isEqualTo("1");
    }

//    @Test
//    public void

}
