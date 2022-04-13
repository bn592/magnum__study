package com.magnum.study.game;

import java.util.Random;
import java.util.Scanner;

public class GuGuDan_Game {
    public static void main(String[] args) {
 /*
    1.컴퓨터가 1~9까지의 숫자 2개를 랜덤으로 생성합니다.
    2.생성한 숫자 2개의 곱셈을 미리합니다.
    3.사람에게 랜덤으로 생성된 2개 숫자의 곱셈을 물어봅니다.
    4.만약 사람의 정답과 컴퓨터의 정답이 같다면, 정답출력, 오답이면 문제,정답 출력
 */

    int randomX;  //랜덤으로 생성한 숫자
    int randomY;
    int ranAnswer; //랜덤수로 곱해진 결과값
    int inputNUM;  //사용자가 입력한 숫자
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
        System.out.println("구구단 게임을 시작합니다~!");

        randomX = random.nextInt(9)+1;
        randomY = random.nextInt(9)+1;
        ranAnswer = randomX * randomY;
        System.out.println(randomX + "*" + randomY + "=" + "?");

        inputNUM = sc.nextInt();

        if(ranAnswer == inputNUM){
            System.out.println("짝짝짝~ 정답입니다!!");
        } else {
            System.out.println("ㅠㅠ틀렸습니다. 정답은 " + randomX +"*"+randomY+"="+ ranAnswer + "입니다~~");
        }
    }
}
