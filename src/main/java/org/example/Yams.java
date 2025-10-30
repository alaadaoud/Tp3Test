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

    private static boolean estCarre(int[] des) {
        int[] counts = new int[7];
        for (int d : des) {
            counts[d]++;
            if (counts[d] >= 4) return true;
        }
        return false;
    }

    private static boolean estFull(int[] des) {
        int[] counts = new int[7];
        boolean paire = false;
        boolean brelan = false;

        for (int d : des) counts[d]++;

        for (int count : counts) {
            if (count == 2) paire = true;
            if (count == 3) brelan = true;
        }

        return paire && brelan;
    }










    public static int CalculerPoints(int[] lancer) {


        if (estCarre(lancer)) return 35;
        if (estFull(lancer)) return 30;
        if (estBrelan(lancer)) return 28;
        return 0 ;
    }


}
