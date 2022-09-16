package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        palindrom();
    }

    static void palindrom() {
        String slovo = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(slovo); //lepší string který má více metod, musí být použít String
        stringBuilder.reverse();
        if(slovo.equals(stringBuilder.toString())){
            System.out.println("Slovo je palindrom");
        }else{
            System.out.println("Slovo není palindrom");
        };

    }
}
