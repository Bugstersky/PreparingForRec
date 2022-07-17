package tasks;

public class Fibonacci {

    public int fbRecursion(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fbRecursion(n - 1) + fbRecursion(n - 2);
        }
    }

    public void displaySeq(int n) {
        int x = 0;
        int y = 1;
        for (int i = 3; i <= n; i++) {
            int temp = x + y;
            System.out.print(" " + temp);
            x = y;
            y = temp;
        }
    }

}
