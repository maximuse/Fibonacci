package hu.nyirszikszi;

import hu.nyirszikszi.fibonacci.Fibonacci;

public class Main {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci(20);
        System.out.println("A Fibonacci szamsor elso " + f.getN() + " eleme:\t" + f.getFibonacci());
        f.setN(5);
        System.out.println("A Fibonacci szamsor elso " + f.getN() + " eleme:\t" + f.getFibonacci());
    }
}
