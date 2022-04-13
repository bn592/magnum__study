package com.magnum.study.study;

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        //삼각형 모양의 별
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("================");

        //피라미드 모양의 별
        for (int a = 0; a < 5; a++) { //행의 갯수
            for (int j = 0; j < 4 - a; j++) { //공백 열의 갯수
                System.out.print(" ");
            }
            for (int j = 0; j < a * 2 + 1; j++) { //별 열의 갯수
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("================");

        //홀수 입력시 그 수 만큼 마름모 모양의 별찍기
//        System.out.print("홀수를 입력해주세요.: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //마름모 모양의 별찍기 먼저!
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");

             for(int k = 0; j < i*2-1; k++){
                 System.out.print("*");
             }
                System.out.println();
            }
        }
    }
}


