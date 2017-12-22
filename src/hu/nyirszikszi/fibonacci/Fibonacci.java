package hu.nyirszikszi.fibonacci;

import java.util.ArrayList;

public class Fibonacci {
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList getFibonacci() {
        ArrayList szamok = new ArrayList();
        int a = 0;
        int b = 1;
        int c = 0;

        szamok.add(a);

        for(int i=0; i<this.n-1; i++) {
            c = a + b;
            a = c;
            b = c - b;

            szamok.add(c);
        }

        return szamok;
    }
}