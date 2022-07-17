package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.FizzBuzz;

public class FizzBuzzTimeTest {

    @BeforeEach
    void infoBefore(){
        System.out.println("Start before Test");
    }
    @Test
    void fizzTime(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        // I was testing it for each single method
        fizzBuzz.streamFBApp();
        fizzBuzz.streamFBApp();
    }

    @AfterEach
    void infoAfter(){
        System.out.println("After Test");
    }
}
