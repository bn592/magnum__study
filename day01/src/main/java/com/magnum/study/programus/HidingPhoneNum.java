package com.magnum.study.programus;

public class HidingPhoneNum {
    public static void main(String[] args) {
        HidingPhoneNum phoneNum = new HidingPhoneNum();
    }
    public HidingPhoneNum() {
        solution("01036891771");
    }
    private String solution(String phone_number) {
        String answer = "";
        String backNum = "";

        for(int i = 0; i < phone_number.length() -4; i++){
            answer += "*";

        }
        backNum = phone_number.substring(phone_number.length() -4);
        answer += backNum;

        return answer;
    }
}
