package Lesson_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
           boolean withinSum = within10and20(9, 9);
           System.out.println(withinSum);
           isPlusOrMinus(-3);
           boolean number = whatIsNumber(-5);
           System.out.println(number);
           System.out.println();
           writeManyWord("", 0, 0);
    }
    public static boolean within10and20(int a, int b) {
            return (a + b >= 10 & a + b <= 20);
    }
    public static void isPlusOrMinus(int x) {
        if (x >= 0) {
                System.out.println("Число положительное.");
        } else {
                System.out.println("Число отрицательное.");
        }
    }
    public static boolean whatIsNumber(int y) {
        if (y < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void writeManyWord(String word, int times, int y) {
        for (times = 0; times < 7; times++){
            for (y = 0; y < 3; y++){
                System.out.print("kind ");
            }
            System.out.println();
        }
    }
}
