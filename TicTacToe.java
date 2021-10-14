/*
   Homework 4
   @author Авдеев Станислав
   @version 15.10.2021
 */

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    final char SIGN_X = 'x';
    final char SIGN_0 = '0';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;



    public static void main(String[] args) {
        new TicTacToe().game();

    }

    TicTacToe() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);

    }

    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAi();
            printTable();
            if (isWin(SIGN_0)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }

        }
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }

    }

    void printTable() {

        System.out.println();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAi() {
        int x, y;
        int[] res = new int[2];

        do {
            res = findAdress(SIGN_X);
            if (res.length == 2){
                x = res[0];
                y = res[1];
            } else {
                x = random.nextInt(3);
                y = random.nextInt(3);
            }

        } while (!isCellValid(x, y));
        table[y][x] = SIGN_0;

    }

    boolean isCellValid(int x, int y) {

        if (x < 0 || x > 2 || y < 0 || y > 2)
            return false;
        return table[y][x] == SIGN_EMPTY;

    }


    boolean isWin(char ch) {

        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == ch) && (table[i][1] == ch) && (table[i][2] == ch)) return true;
            if ((table[0][i] == ch) && (table[1][i] == ch) && (table[2][i] == ch)) return true;
        }

        if ((table[0][0] == ch) && (table[1][1] == ch) && (table[2][2] == ch)) return true;
        if ((table[2][0] == ch) && (table[1][1] == ch) && (table[0][2] == ch)) return true;

        return false;
    }

    int[] findAdress(char ch) {

        int[] res = null;
        int[] empty = new int[1];

        res = getAddressX(ch);
        if (res.length == 2) return res;

        res = getAddressY(ch);
        if (res.length == 2) return res;

        res = getAddressDiagonalX(ch);
        if (res.length == 2) return res;

        res = getAddressDiagonalY(ch);
        if (res.length == 2) return res;

        return empty;

    }

    int[] getAddressX(char ch) {

        int summa = 0;
        int[] res = new int[2];
        int[] empty = new int[1];
        int i = 0;
        boolean flag = false;

        while (i < 3 && summa < 2) {

            summa = 0;
            flag = false;

            if (table[i][0] == ch) {
                summa++;
            } else if (table[i][0] == SIGN_EMPTY) {
                res[0] = 0;
                res[1] = i;
                flag = true;
            }

            if (table[i][1] == ch) {
                summa++;
            } else if (table[i][1] == SIGN_EMPTY) {
                res[0] = 1;
                res[1] = i;
                flag = true;
            }

            if (table[i][2] == ch) {
                summa++;
            } else if (table[i][2] == SIGN_EMPTY) {
                res[0] = 2;
                res[1] = i;
                flag = true;
            }
            i++;
        }

        return (summa == 2 && flag) ? res : empty;

    }

    int[] getAddressY(char ch) {

        int summa = 0;
        int[] res = new int[2];
        int[] empty = new int[1];
        int i = 0;
        boolean flag = false;

        while (i < 3 && summa < 2) {
            flag = false;
            summa = 0;

            if (table[0][i] == ch) {
                summa++;
            } else if (table[0][i] == SIGN_EMPTY) {
                res[0] = i;
                res[1] = 0;
                flag = true;
            }

            if (table[1][i] == ch) {
                summa++;
            } else if (table[1][i] == SIGN_EMPTY) {
                res[0] = i;
                res[1] = 1;
                flag = true;
            }

            if (table[2][i] == ch) {
                summa++;
            } else if (table[2][i] == SIGN_EMPTY) {
                res[0] = i;
                res[1] = 2;
                flag = true;
            }
            i++;
        }

        return (summa == 2 && flag) ? res : empty;

    }

    int[] getAddressDiagonalX(char ch){

        int summa = 0;
        int[] res = new int[2];
        int[] empty = new int[1];
        boolean flag = false;

        if (table[0][0] == ch) {
            summa++;
        } else if (table[0][0] == SIGN_EMPTY) {
            res[0] = 0;
            res[1] = 0;
            flag = true;
        }

        if (table[1][1] == ch) {
            summa++;
        } else if (table[1][1] == SIGN_EMPTY) {
            res[0] = 1;
            res[1] = 1;
            flag = true;
        }

        if (table[2][2] == ch) {
            summa++;
        } else if (table[2][2] == SIGN_EMPTY) {
            res[0] = 2;
            res[1] = 2;
            flag = true;
        }
        return (summa == 2 && flag) ? res : empty;
    }

    int[] getAddressDiagonalY(char ch){

        int summa = 0;
        int[] res = new int[2];
        int[] empty = new int[1];
        boolean flag = false;

        if (table[2][0] == ch) {
            summa++;
        } else if (table[2][0] == SIGN_EMPTY) {
            res[0] = 0;
            res[1] = 2;
            flag = true;
        }

        if (table[1][1] == ch) {
            summa++;
        } else if (table[1][1] == SIGN_EMPTY) {
            res[0] = 1;
            res[1] = 1;
            flag = true;
        }

        if (table[0][2] == ch) {
            summa++;
        } else if (table[0][2] == SIGN_EMPTY) {
            res[0] = 2;
            res[1] = 0;
            flag = true;
        }
        return (summa == 2 && flag) ? res : empty;
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY)
                    return false;
            }
        }
        return true;

    }
}
