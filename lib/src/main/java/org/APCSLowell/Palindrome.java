package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        s=s.toLowerCase();
        s=onlyLetters(s);
        return (s.equals(reverse(s)));
    }
    public String reverse(String s) {
        String temp = "";
        for(int i = s.length(); i>0; i--)
            temp+=s.substring(i-1,i);
        return temp;
    }
    public String onlyLetters(String sString){
        String temp = "";
        for(int i = 0; i<sString.length(); i++)
            if (Character.isLetter(sString.charAt(i)))
                temp += sString.substring(i,i+1);
        return temp;
    }
}
