package com.company;
import java.lang.String;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*System.out.print("Hello word!");
        System.out.println("Test");
        byte num=127;
        System.out.println(num);
        float a, b = 2.5f;
        System.out.println(b);
        boolean istrue = true;
        System.out.println(istrue);
        char sym = 's';
        System.out.println(sym);
        String string1 = "Hello word";
        System.out.println((string1));
        Scanner str_scanner = new Scanner(System.in);
        System.out.println("Your string is " + str_scanner.nextLine()); */

        //input and output
        Scanner num = new Scanner(System.in);
        int first,second, result;
        System.out.println("Input first num");
        first = num.nextInt();
        System.out.println("Input second num");
        second = num.nextInt();
        result= first + second;
        System.out.println("Result:" + result);

    }
}
