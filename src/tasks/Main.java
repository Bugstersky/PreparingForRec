package tasks;

public class Main {
    public static void main(String[] args) {
        //1.FizzBuzz task solution
        FizzBuzz fizzBuzz = new FizzBuzz();
        //fizzBuzz.fbApp();
        // fizzBuzz.streamFBApp();
        System.out.println("");
        //2.
        Fibonacci fibonacci = new Fibonacci();
        //System.out.println(fibonacci.fbRecursion(10));
        //fibonacci.displaySeq(10);
        //3. Simple Palindrome Task
        String checkWord = "Mom";
        System.out.printf("Is a %s a palindrome? %b",checkWord,Palindrome.checkPalindrome(checkWord));

    }
}
