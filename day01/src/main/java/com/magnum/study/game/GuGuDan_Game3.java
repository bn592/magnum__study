package com.magnum.study.game;

import java.util.Random;
import java.util.Scanner;
/*  *** 1번 + 5번의 문제만 생성된다.***
  1.컴퓨터가 1~9까지의 숫자 2개를 랜덤으로 생성합니다.
  2.생성한 숫자 2개의 곱셈을 미리합니다.
  3.사람에게 랜덤으로 생성된 2개 숫자의 곱셈을 물어봅니다.
  4.정답 및 오답을 출력
  5.다섯번의 문제를 내준 뒤, 사람이 맞춘 문제들을 점수화해서 점수를 출력합니다.
*/
public class GuGuDan_Game3 {

    int randomX;  //랜덤으로 생성한 숫자
    int randomY;
    int ranAnswer; //랜덤수로 곱해진 결과값
    int inputNUM;  //사용자가 입력한 숫자
    int score;     //점수
    int scoreSum;  //총합

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    private GuGuDan_Game3() {
        System.out.println("구구단게임을 시작합니다!!!!!");
        makeRandomMulti();
    }

    private void makeRandomMulti(){
       for(score =0; score < 5;) {
            score++;
            randomX = random.nextInt(9) + 1;
            randomY = random.nextInt(9) + 1;
            ranAnswer = randomX * randomY;  //랜덤 수 곱해서 저장
            System.out.println(randomX + "*" + randomY + "= ?");
            inputNUM = sc.nextInt();    //사용자가 적은 답 저장
            if (ranAnswer == inputNUM) {
              System.out.println("짝짝짝~ 정답입니다!!");
              scoreSum += 20;

            } else {
                System.out.println("틀렸습니다. 다시 도전 해보세요");
            }
       }
       if(scoreSum == 100){
          System.out.println("축하합니다! 총 " + scoreSum+" 점으로 만점입니다");
       } else {
           System.out.println("점수는 " + scoreSum + "입니다.");
       }
   }


    public static void main(String[] args) {

        GuGuDan_Game3 gugu = new GuGuDan_Game3();
    }
}

