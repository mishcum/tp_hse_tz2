package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class App {

    static File f;

    App(String file) {
        f = new File(file);
    }

    public BigInteger _min() throws FileNotFoundException {
        Scanner in = new Scanner(f);
        BigInteger first = new BigInteger(in.next());
        while (in.hasNext()) {
            BigInteger other = new BigInteger(in.next());
            if (first.compareTo(other) == 1) {
                first = other;
            }
            
        }
        in.close();
        return first;
    }

    public BigInteger _max() throws FileNotFoundException {
        Scanner in = new Scanner(f);
        BigInteger first = new BigInteger(in.next());
        while (in.hasNext()) {
            BigInteger other = new BigInteger(in.next());
            if (first.compareTo(other) == -1) {
                first = other;
            }
            
        }
        in.close();
        return first;
    }

    public BigInteger _sum() throws FileNotFoundException {
        Scanner in = new Scanner(f);
        BigInteger first = new BigInteger(in.next());
        while (in.hasNext()) {
            BigInteger other = new BigInteger(in.next());
            first = first.add(other);
        }
        in.close();
        return first;
    }

    public BigInteger _mult() throws FileNotFoundException {
        Scanner in = new Scanner(f);
        BigInteger first = new BigInteger(in.next());
        while (in.hasNext()) {
            BigInteger other = new BigInteger(in.next());
            first = first.multiply(other);
        }
        in.close();
        return first;
    }
    

    public static void main(String[] args) throws FileNotFoundException {
        App T = new App("demo/src/test/java/com/example/test1.txt");
        App T2 = new App("demo/src/test/java/com/example/test2.txt");
        App T3 = new App("demo/src/test/java/com/example/test3.txt");
        App T4 = new App("demo/src/test/java/com/example/test4.txt");
        App T5 = new App("demo/src/test/java/com/example/test5.txt");
        System.out.println("Min: " + T._min());
        System.out.println("Max: " + T._max());
        System.out.println("Sum: " + T._sum());
        System.out.println("Mult: " + T._mult());

        System.out.println("Min: " + T2._min());
        System.out.println("Max: " + T2._max());
        System.out.println("Sum: " + T2._sum());
        System.out.println("Mult: " + T2._mult());

        System.out.println("Min: " + T3._min());
        System.out.println("Max: " + T3._max());
        System.out.println("Sum: " + T3._sum());
        System.out.println("Mult: " + T3._mult());

        System.out.println("Min: " + T4._min());
        System.out.println("Max: " + T4._max());
        System.out.println("Sum: " + T4._sum());
        System.out.println("Mult: " + T4._mult());

        System.out.println("Min: " + T5._min());
        System.out.println("Max: " + T5._max());
        System.out.println("Sum: " + T5._sum());
        System.out.println("Mult: " + T5._mult());
    }
}

