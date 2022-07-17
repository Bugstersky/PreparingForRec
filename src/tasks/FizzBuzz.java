package tasks;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class FizzBuzz {

    public void fbApp() {
        //FizzBuzz for range 1-100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Using stream
    public void streamFBApp() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "FizzBuzz" : "Fizz") : (i % 3 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }


}
