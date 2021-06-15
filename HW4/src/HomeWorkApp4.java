import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    public static void main(String[] args) {
        createMap();
        showMap();

        while (true) {
            playerMove();
            showMap();
            if (win(player)) {
                System.out.println("Игрок выиграл!");
                break;
            }

            if (fullMap()) {
                System.out.println("Ничья!");
                break;
            }

            computerMove();
            showMap();

            if (win(computer)) {
                System.out.println("Компьтер выиграл!");
                break;
            }

            if (fullMap()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра окончена!");

    }

    public static char[][] map;
    public static int widthMap;
    public static int heightMap;
    public static int winInt;

    public static char player = 'X';
    public static char computer = 'O';
    public static char empty = '_';

    public static Scanner pencil = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() {
        widthMap = 5;
        heightMap = 5;
        winInt = 4;
        map = new char[heightMap][widthMap];

        for (int y = 0; y < heightMap; y++) {
            for (int x = 0; x < widthMap; x++) {
                map[y][x] = empty;
            }
        }
    }

    public static void showMap() {
        System.out.print(" ");
        for (int i = 0; i < widthMap * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " " : (i / 2 + 1));
        }
        System.out.println();

        for (int y = 0; y < heightMap; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < widthMap; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static void playerMove() {
        int y;
        int x;

        do {
            System.out.print("Введите Ваши координаты: ");
            x = pencil.nextInt() - 1;
            y = pencil.nextInt() - 1;
        }

        while (!validCoordinates(y, x) || !emptyField(y, x));

        map[y][x] = player;
        System.out.println("Вы ввели координаты: [" + (x + 1) + ":" + (y + 1) + "]");

    }

    public static void computerMove() {
        int y;
        int x;

        do {
            y = random.nextInt(widthMap);
            x = random.nextInt(heightMap);
        }

        while (!emptyField(y, x));

        map[y][x] = computer;
        System.out.println("Компьютер ввел координаты: [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static boolean validCoordinates(int y, int x) {
        return x >= 0 && x < widthMap && y >= 0 && y < heightMap;
    }

    public static boolean emptyField(int y, int x) {
        return map[y][x] == empty;
    }

    public static boolean fullMap() {
        for (int y = 0; y < heightMap; y++) {
            for (int x = 0; x < widthMap; x++) {
                if (map[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean win(char player) {
        int vertical;
        int horizontal;
        int diagonalpos;
        int diagonalneg;
        for (int x = 0; x <= widthMap - 1; x++) {
            horizontal = 0;
            for (int y = 0; y <= heightMap - 1; y++) {

                if (map[x][y] == player) { // по горизонтали
                    horizontal++;
                    if (horizontal == winInt)
                        return true;
                } else {
                    horizontal = 0;
                }
            }
        }
        for (int y = 0; y <= heightMap - 1; y++) {
            vertical = 0;
            for (int x = 0; x <= widthMap - 1; x++)
                if (map[x][y] == player) { // по вертикали
                    vertical++;
                    if (vertical == winInt)
                        return true;
                } else {
                    vertical = 0;
                }
        }

        for (int y = 0; y <= heightMap - winInt; y++) {
            diagonalpos = 0;
            diagonalneg = 0;
            for (int x = 0; x <= widthMap - 1; x++) { // по диагонали \
                if (x + y <= heightMap - 1) {
                    if (map[x][x + y] == player) {
                        diagonalpos++;
                        if (diagonalpos == winInt)
                            return true;
                    } else
                        diagonalpos = 0;
                }
                if (widthMap - 1 - x - y >= 0) { // по диагонали /
                    if (map[x][widthMap - 1 - x - y] == player) {
                        diagonalneg++;
                        if (diagonalneg == winInt)
                            return true;
                    } else
                        diagonalneg = 0;
                }
            }
        }
        return false;
    }
}
