public class FizzBuzz {

  public String convert(int num) {
    String fizzBuzz = "FizzBuzz";
    if (num % 15 == 0) {
      return fizzBuzz;
    } else if (num % 3 == 0) {
      String fizz = "Fizz";
      return fizz;
    } else
    return String.valueOf(num);
  }
}
