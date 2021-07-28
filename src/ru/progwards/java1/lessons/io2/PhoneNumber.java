package ru.progwards.java1.lessons.io2;

import java.util.Arrays;

public class PhoneNumber {


    public static String format(String phone) throws Exception {
        String phoneNum;
        StringBuilder resultNum = new StringBuilder();
        for (char c : phone.toCharArray())
            if (Character.isDigit(c))
                resultNum.append(c);
        if (resultNum.length() >= 10 & resultNum.length() <= 11) {
            phoneNum = resultNum.toString();
            phoneNum = "+7(" + phoneNum.substring(1,4) + ")" + phoneNum.substring(4,7) + "-" + phoneNum.substring(7);
        } else throw new Exception();

        return phoneNum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(format("+8(924) 265 45 - 54"));
    }
}
