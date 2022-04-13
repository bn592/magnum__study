package com.magnum.study.programus;

public class ArrAverage {
    public double solution(int[] arr) {
        double answer = 0;
        double arrSum = 0;

        for(int i = 0; i < arr.length; i++){
            arrSum += arr[i];
            answer = arrSum / arr.length;
        }
            return answer;
    }
}
