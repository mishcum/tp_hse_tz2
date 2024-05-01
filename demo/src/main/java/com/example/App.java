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
        
    }
}

