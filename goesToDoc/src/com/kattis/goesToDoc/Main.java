package com.kattis.goesToDoc;

public class Main {

    public static void main(String[] args){
        System.out.println(isGoing("aaah", "aaaaaaah"));
    }

    public static boolean isGoing(String a, String b){
        if(a.length() < b.length()){
            return false;
        }
        else
            return true;
    }
}
