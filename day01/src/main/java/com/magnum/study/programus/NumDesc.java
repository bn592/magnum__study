package com.magnum.study.programus;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class NumDesc {
    public long solution(long n) {
        long answer = 0;

        String str = String.valueOf(n);
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            String tmp = String.join("",arr);
            answer = Long.parseLong(tmp);

        }
        return answer;
    }

    public static void main(String[] args) {
        NumDesc desc = new NumDesc();
        System.out.print(desc.solution(89513));

    }
}
