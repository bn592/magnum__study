package com.magnum.study.study;

import java.util.Scanner;

public class OddNum {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[][] array = new int[3][3];
        int rowStart = 0;
        int colStart = 1;
        int curNum=1;

        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 2
        rowStart = rowStart - 1;
        colStart = colStart + 1;

        if (rowStart < 0) {
            rowStart = array.length -1;
        }

        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 3
        rowStart = rowStart - 1;
        colStart = colStart + 1;

        if (colStart >= array.length) {
            colStart = 0;
        }

        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 4
        rowStart = rowStart - 1;
        colStart = colStart + 1;

        if (array[rowStart][colStart] != 0) {
            rowStart = rowStart + 1;
            colStart = colStart - 1;
            rowStart = rowStart + 1;
        }

        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 5
        rowStart = rowStart - 1;
        colStart = colStart + 1;

        if (array[rowStart][colStart] == 0) {

            array[rowStart][colStart] = curNum++;
        }


        //대각선이동 후 값채우기 6
        rowStart = rowStart - 1;
        colStart = colStart + 1;

        if (array[rowStart][colStart] == 0) {

            array[rowStart][colStart] = curNum++;
        }

        //대각선이동 후 값채우기 7
        rowStart = rowStart + 1;
        colStart = colStart - 1;

        if (array[rowStart][colStart] != 0) {
            colStart = array.length - 1;
        }

        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 8
        rowStart = rowStart - 1;
        colStart = colStart + 1;

        if (colStart >= array.length) {
            colStart = 0;
        }

        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 9
        rowStart = rowStart - 1;
        colStart = colStart + 1;

        if (rowStart < 0) {
            rowStart = array.length -1;
        }

        array[rowStart][colStart] = curNum++;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print( array[i][j]);
            }
            System.out.println();
        }
    }
}



//        System.out.println("hello world");
//        System.out.println("***************************");
//
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = 0;
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("***************************");
