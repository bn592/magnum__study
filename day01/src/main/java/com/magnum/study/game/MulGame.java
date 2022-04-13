package com.magnum.study.game;

import java.util.Random;
import java.util.Scanner;

public class MulGame {
    int x; // 랜덤으로 생성 할 숫자
    int y;
    int z;  // 사람이 적을 답
    int answer; // 계산된 답
    int i; // 문제반복
    int score; // 점수
    Scanner scan = new Scanner(System.in); // 정답을 받아냄
    Random random = new Random(); // 랜덤숫자 생성

    MulGame(){
        System.out.println("구구단 게임을 시작합니다.");
        makeMul();
    }

    public void makeMul(){
        while(i < 5) {
            i++;
            x = random.nextInt(9)+1;
            y = random.nextInt(9)+1;
            answer = x*y; // 시스템 정답 저장
            System.out.println(x+"X"+y+"= ?");
            z = scan.nextInt(); // 사람이 적은 정답 저장
            if(z == answer) {
                System.out.println("정답입니다!");
                score +=  20;
            }else {
                System.out.println("오답입니다!");
            }
        }
        if(score == 100) {
            System.out.println("만점입니다! 대단합니다!");
        }else {
            System.out.println("최종점수는 100점 만점 중 "+score+" 점입니다."
                    + "\n아쉽게만점을 받지 못했습니다.\n"
                    + "분발하세요!");
        }
    }

    public static void main(String[] args) {
        MulGame mulgame = new MulGame();
    }
}