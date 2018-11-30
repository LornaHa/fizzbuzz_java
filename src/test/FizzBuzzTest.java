package com.tdd;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest {

@Test
public void printsAllOtherNumbers(){

    FizzBuzz fizzBuzz = new FizzBuzz();

    Assert.assertEquals("1", fizzBuzz.convert(1));
    Assert.assertEquals("2", fizzBuzz.covert(2));
}

}
