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


    private static boolean estGrandeSuite(int[] des) {
        boolean[] present = new boolean[7];
        for (int d : des) present[d] = true;
        return (present[1] && present[2] && present[3] && present[4] && present[5]) ||
                (present[2] && present[3] && present[4] && present[5] && present[6]);
    }


    private static boolean estYams(int[] des) {
        for (int i = 1; i < des.length; i++) {
            if (des[i] != des[0]) return false;
        }
        return true;
    }




    private static int sommeDes(int[] des) {
        int sum = 0;
        for (int d : des) sum += d;
        return sum;
    }







    public static int CalculerPoints(int[] lancer) {

        if (estYams(lancer)) return 50;
        if (estGrandeSuite(lancer)) return 40;
        if (estCarre(lancer)) return 35;
        if (estFull(lancer)) return 30;
        if (estBrelan(lancer)) return 28;
        return sommeDes(lancer) ;
    }


}
