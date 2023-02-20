package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	getString("Ey bruv");
    }
    public static String getString (String s){
        Scanner scanner = new Scanner(System.in);
        System.out.println(s + " : ");
        return scanner.nextLine();
    }
}
