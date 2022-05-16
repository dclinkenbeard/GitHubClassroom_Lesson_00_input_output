package com.daclink;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;

        try{
            System.out.println("Reading x");
            x = Integer.parseInt(scan.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Couldn't parse first integer ");
        }

        try{
            System.out.println("reading y");
            y = Integer.parseInt(scan.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Couldn't parse first integer ");
        }

        System.out.println(Main.adder(x,y));

    }

    public static int adder(int x,int y){
        return x + y;
    }
}