package com.magnum.study.study;

public class Star2 {
    public static void main(String[] args) {
        //모래시계모양으로 별 찍기
        System.out.println("*********");
        System.out.println(" ******* ");
        System.out.println("  *****  ");
        System.out.println("   ***   ");
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");
        System.out.println("==================================");
        System.out.println("");


        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int a = 1; a <= 5; a++) {
            for (int j = 1; j <= 5 - a; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= a * 2 - 1; k++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}

