package com.company;

public class Main {

    //игроки
    public static String[] playersName = {"Golem", "Lucki", "Medical", "Berserk", "Thor"};
    public static int[] playersHealth = {200, 190, 210, 195};
    public static int[] playersAttack = {25, 25, 26, 20};
    //босс
    public static int bossHealth = 700;
    public static int bossAttack = 50;

    public static void main(String[] args) {
        printStatistics();
        while (!gameOver()) {
            ;
            round();
        }
    }

    public static void round() {
        playersHit();
        bossHit();
        printStatistics();
    }

    public static void printStatistics() {
        System.out.println("boss health:" + bossHealth);
        for (int i = 0; i < playersName.length; i++) {
            System.out.println(playersName[i] + " health: " + playersHealth[i]);
        }
        System.out.println("<><><><><><><><><><><><>");
    }

    public static void playersHit() {
        for (int i = 0; i < playersName.length; i++) {
            bossHealth -= playersAttack[i];
            if (bossHealth < 0) {
            }

        }
    }

    public static void bossHit() {
        for (int i = 0; i < playersName.length; i++) {
            playersHealth[i] -= bossAttack;
            if (playersHealth[i] < 0) {
                playersHealth[i] = 0;
            }
        }
    }

    public static boolean gameOver() {
        if (bossHealth <= 0) {
            System.out.println(" players Win ");
            return true;
        }
        if (playersHealth[0] <= 0 && playersHealth[1] <= 0 && playersHealth[2] <= 0) {
            System.out.println(" Boss Win ");
            return true;
        }
        return false;
    }


}