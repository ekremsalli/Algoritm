package tr.com.example.oop;

import tr.com.example.numeric.fibonacci.Fibonacci;

public class App {
    public static void main(String[] args) {
        Fibonacci.printFibonacci(20);
        System.out.println();
        System.out.println(Fibonacci.getFibonacciNumberByOrder(20));

        System.out.println(Fibonacci.getFibonacciOrderOfNumber(21));
    }
}

