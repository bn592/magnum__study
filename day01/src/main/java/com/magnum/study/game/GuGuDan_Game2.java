package com.magnum.study.game;

import java.util.Random;
import java.util.Scanner;

public class GuGuDan_Game2 {
    public static void main(String[] args) {
 /*  *** 1번 + 오답일때만 문제 반복생성***
    1.컴퓨터가 1~9까지의 숫자 2개를 랜덤으로 생성합니다.
    2.생성한 숫자 2개의 곱셈을 미리합니다.
    3.사람에게 랜덤으로 생성된 2개 숫자의 곱셈을 물어봅니다.
    4.만약 사람의 정답과 컴퓨터의 정답이 같다면  정답이라는 문구 출력,
      오답이면 문제,정답 출력 후 새로운 문제를 냅니다.(재귀함수 사용 x)
 */

        int randomX;  //랜덤으로 생성한 숫자
        int randomY;
        int ranAnswer; //랜덤수로 곱해진 결과값
        int inputNUM;  //사용자가 입력한 숫자

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 게임을 시작합니다~!");

        randomX = random.nextInt(9) + 1;
        randomY = random.nextInt(9) + 1;
        ranAnswer = randomX * randomY;
        System.out.println(randomX + "*" + randomY + "=" + "?");

        inputNUM = sc.nextInt();

        while(true) {
            if (ranAnswer == inputNUM) {
                System.out.println("짝짝짝~ 정답입니다!!");
                break;
            } else {
                System.out.println("ㅠㅠ틀렸습니다. 정답은 " + randomX + "*" + randomY + "=" + ranAnswer + "입니다~~");
                System.out.println("다시 도전해 보세요");
                randomX = random.nextInt(9) + 1;
                randomY = random.nextInt(9) + 1;
                ranAnswer = randomX * randomY;
                System.out.println(randomX + "*" + randomY + "=" + "?");

                inputNUM = sc.nextInt();

            }
        }
    }
}
