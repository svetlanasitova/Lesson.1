package Lesson_3;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        fillTwoDiagonal();
        getArray(8);
        findMaxAndMin();
        findMaxAndMin1();
//        findBalance();  .//что не так?
    }

    private static void invertArray() {
        int[] arr = {0, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        System.out.println("\nВывод замены элементов:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1) {
                arr[i] = arr[i] - 1;
                System.out.print(arr[i] + ",");
            } else if (arr[i] < 1) {
                arr[i] = arr[i] + 1;
                System.out.print( arr[i] + ",");
            }
            System.out.println();
        }
    }
    public static void fillArray() {
        int[] arr = new int[50];
        System.out.print("Вывод элементов массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(" "  + arr[i] + ",");
        }
        System.out.println();
    }
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Вывод измененных элементов:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " , ");
            }   else if(arr[i] >= 6){
                arr[i] = arr[i];
                System.out.print(arr[i] + " , ");
            }
            System.out.println();
        }
    }
    public static void fillDiagonal() {
        int[][] arr = {{1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {1, 0, 0, 0, 1}};
        System.out.println("Вывод квадрата.");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void fillTwoDiagonal(){
        int[][] arr = new int[5][5];
        arr[0][0] = 1;
        arr[0][4] = 1;
        arr[1][1] = 1;
        arr[1][3] = 1;
        arr[2][2] = 1;
        arr[3][1] = 1;
        arr[3][3] = 1;
        arr[4][0] = 1;
        arr[4][4] = 1;
        System.out.println("Вывод диагоналей.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void getArray(int len){
        int [] initialValue = new int[len];
        System.out.println("Длина = " + len);
        for (int i = 0; i < initialValue.length; i++){
            System.out.print( " initialValue = " + initialValue[i] + ";");
        }
        System.out.println();
    }
    public static void findMaxAndMin(){
        int[] arr = { 5, 9, 42, -6, 1, 86, 25, 16, -2, 0, 78};
        int min = arr[0];
        int max = arr[arr.length - 1];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.print("Min = " + arr[i]);
            } else if (arr[i] > max) {
                max = arr[i];
                System.out.print("Max = " + arr[i]);
            }
            System.out.println();
        }
    }
    public static void findMaxAndMin1(){
        int[] arr = {0, 15, -9, 66, 7, -2, 99};
        Arrays.sort(arr);
        int min = arr[0];
        System.out.print("Минимальное число = " + min + "\t");
        int max = arr[arr.length - 1];
        System.out.println("Максимальное число = " + max + "\t");
    }

}
