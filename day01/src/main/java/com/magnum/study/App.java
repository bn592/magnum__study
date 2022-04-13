package com.magnum.study;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

    /* 공 공 공 * 공 공 공
     * 공 공  * * * 공 공 */

    //수를 입력받는다.
        System.out.print("숫자를 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = num; i >= 1; i--) {
            for(int j = 0; j < num-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
