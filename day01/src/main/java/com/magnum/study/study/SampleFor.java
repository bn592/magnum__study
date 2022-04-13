package com.magnum.study.study;

public class SampleFor {
    //제어문은 제어문의 조건식이 참일때만 수행됨.
    public void doLoop(){
        if(true){
            System.out.println("참일때만 수행");
        }
        //for문 증감식이 수행문에 있어도 됨.
        for(int i = 0; i < 10; ) {
            i++;
            i = i +1;
            System.out.println("무한으로 계속..");
        }
    }

    public static void main(String[] args) {
        new SampleFor().doLoop();
    }
}
