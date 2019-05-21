package com.kattis.goesToDoc;

public class Main {

    public static void main(String[] args){
        String a = "aah";
        String b = "ah";

        isGoing(a, b);
    }

    public static void isGoing(String a, String b){
        if(a.length() < b.length()){
            System.out.println("no");
        }
        else
            System.out.println("go");
    }


}
