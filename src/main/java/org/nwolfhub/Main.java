package org.nwolfhub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BigInteger> A = new ArrayList<>();
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.valueOf(3);
        A.add(a);
        A.add(b);

        while (A.size() < 40) {
            BigInteger next = b.multiply(BigInteger.valueOf(5)).add(a);
            if (next.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                A.add(next);
            }
            a = b;
            b = next;
        }
        System.out.println(A.get(39));
    }
}