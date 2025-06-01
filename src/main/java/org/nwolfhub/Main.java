package org.nwolfhub;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Double> results = new HashSet<>();
        results.add(1.0);
        for (int k = 1; k < 30; k++) {
            results.add(1.0 / Math.pow(10, k));
        }
        System.out.println(results.size());
    }
}