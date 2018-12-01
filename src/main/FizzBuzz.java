public class FizzBuzz {

  public String convert(int num) {
    String fizzBuzz = "FizzBuzz";
    if (num % 15 == 0) {
      return fizzBuzz;
    } else
    return String.valueOf(num);
  }
}
