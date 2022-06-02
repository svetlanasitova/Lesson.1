package Lesson_4;

import java.util.Random;
import java.util.Scanner;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] field = initField(4);
        printField(field);

        while (true) {
            humanMakeTurn(field);
            printField(field);
            if(isWinner(field, "X")){
                System.out.println("Выиграл X.");
                break;
            }
            if(isDraw(field)){
                System.out.println("Ничья.");
                break;
            }

            aiMakeTurn(field);
            printField(field);
            if(isWinner(field, "O")){
                System.out.println("Выиграли О.");
                break;
            }
        }
    }
    public static String[][] initField(int size){
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++){
            for(int j = 0; j < field[0].length; j++){
                field[i][j] = "*";
            }
        }
        return field;
    }
//    печать поля
    public static void printField (String[][] field){
        System.out.println("-------------" );
        for (int i = 0; i< field.length; i++){
            for(int j = 0; j < field[0].length; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
//    наш ход
    public static void humanMakeTurn(String[][] field) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)){
                if(field[x][y].equals("*")){
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Здесь занято! Ходите снова.");
                }
            }else {
                System.out.println("Зашли за границу! Переходите.");
            }
        }
    }
//ответный ход
    public static void aiMakeTurn(String[][] field) {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "O";
                    break;
                }
            }
        }
    }
//    условия победы
    public static boolean isWinner(String[][] field, String turn){
        for(int i = 0; i < field.length; i++){
            if ((field[i][0].equals(turn) && field[i][1].equals(turn) &&  field[i][2].equals(turn) && field[i][3].equals(turn))||
                (field[0][i].equals(turn) && field[1][i].equals(turn) &&  field[2][i].equals(turn) && field[3][i].equals(turn))||
               (field[0][0].equals(turn) && field[1][1].equals(turn) &&  field[2][2].equals(turn) && field[3][3].equals(turn))||
               (field[3][0].equals(turn) && field[2][1].equals(turn) &&  field[1][2].equals(turn) && field[0][3].equals(turn))) {
                return true;
            }
        }
        return false;
    }
    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }
}
