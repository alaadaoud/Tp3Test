package org.example;

public class Yams {

    private static boolean estBrelan(int[] des) {
        int[] counts = new int[7];
        for (int d : des) {
            counts[d]++;
            if (counts[d] >= 3) return true;
        }
        return false;
    }



    public static int CalculerPoints(int[] lancer) {
        if (estBrelan(lancer)) return 28;
        return 0;
    }
}
