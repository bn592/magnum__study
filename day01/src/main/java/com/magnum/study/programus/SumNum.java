package com.magnum.study.programus;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumNum {
    public long solution(long n) {
        long answer = 0;
        //정수형 숫자를 문자형으로 변환한다.
        String str = String.valueOf(n);

        //변환한 숫자를 String 배열에 잘라서 담는다.
        String[] arr = str.split("");

        //배열 arr에 담긴 숫자를 반복하여 더한다.
        for(int i = 0; i < arr.length; i++){
            //String형을 Long형으로 차례로 변환하여 answer에 더하며 담는다.
            answer += Long.parseLong(arr[i]);
            //System.out.println(arr[i]);
        }
            return answer;
    }
    public static void main(String[] args) {
        SumNum sum = new SumNum();
        System.out.println(sum.solution(657));
    }
}


