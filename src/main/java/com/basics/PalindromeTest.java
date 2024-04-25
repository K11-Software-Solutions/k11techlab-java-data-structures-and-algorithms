package com.basics;

public class PalindromeTest {


    public Boolean isPalindrome(String str) {

        StringBuilder str1 = new StringBuilder();
        str1.append(str1);
        StringBuilder str2 = new StringBuilder();
        str1.append(str2);
        if (str1.equals(str2.reverse())) {
            System.out.println("Result: " + true);
        }

    }




}
