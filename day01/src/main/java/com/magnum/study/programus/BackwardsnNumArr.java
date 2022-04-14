package com.magnum.study.programus;

import java.util.Arrays;
import java.util.Collections;

public class BackwardsnNumArr {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");

        int[] answer = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < arr.length; i++){
            answer[i] =Integer.parseInt(arr[arr.length-1-i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        BackwardsnNumArr backArr = new BackwardsnNumArr();
        System.out.print(Arrays.toString(backArr.solution(12345)));

    }
}
