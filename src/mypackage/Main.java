package mypackage;

public class Main {

    public static int DURATION = 4000000;

    public static void main(String[] args) {

        int fibonacciPrevious = 1;
        int fibonacciNext = 2;
        long sumOfEvenFibNumbers = 2;

        for (int i = 2; i < DURATION; i++) {
            int fibonacciUpcoming= fibonacciPrevious + fibonacciNext;
            int fibonacciCurrent = fibonacciUpcoming - fibonacciPrevious;

            fibonacciNext = fibonacciUpcoming;
            fibonacciPrevious = fibonacciCurrent;

            if(fibonacciNext % 2 == 0){
                sumOfEvenFibNumbers += fibonacciNext;
            }
        }
        System.out.println("The sum of the even Fibonacci numbers under 4 million is " + sumOfEvenFibNumbers);
    }
}
