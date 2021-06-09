import java.util.Random;
public class HomeWorkApp3 {

    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Задание 1");
        intArray();
        System.out.println("Задание 2");
        hundredArray ();
        System.out.println("Задание 3");
        giveArray ();
        System.out.println("Задание 4");
        squareArray (5);
        System.out.println("Задание 5");
        printArray(twoArgArray (10, 0));
        System.out.println("Задание 6");
        minMaxArray();
        System.out.println("Задание 8");
        int[] mas1 = {1, 2, 3, 4, 5, 6};
        printArray(moveArray(mas1,-2));

    }

    public static void printArray(int[] a){    // метод для вывода массива
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public static void intArray() {
        int[] myIntArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив");
        printArray(myIntArray);


        for (int i = 0; i < myIntArray.length; i++)
        if (myIntArray[i] == 0) {
            myIntArray[i] = 1;
        } else {
            myIntArray[i] = 0;
        }
        System.out.println("Измененный массив");
        printArray(myIntArray);
    }

    public static void hundredArray () {
        int[] myHundredArray = new int[100];
        for (int i = 0; i < myHundredArray.length; i++) {
            myHundredArray[i] = i+1;
        }
            printArray(myHundredArray);
    }

    public static void giveArray () {
        int[] myGiveArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив");
        printArray(myGiveArray);
        for (int i = 0; i < myGiveArray.length; i++)
            if (myGiveArray[i] < 6 ) {
                myGiveArray[i] = myGiveArray[i] * 2;
            }
        System.out.println("Числа (которые < 6) умножены на 2");
        printArray(myGiveArray);
    }

    public  static void squareArray (int size) {
        int[][] mySquareArray = new int[size][size];

                for (int i = 0; i < mySquareArray.length; i++) {
                    for (int j = 0; j < mySquareArray[i].length; j++) {

                        if ((mySquareArray[i] == mySquareArray[j]) || (mySquareArray[i] == mySquareArray[size - j - 1])) {
                            mySquareArray[i][j] = 1;
                        }
                        System.out.print(mySquareArray[i][j] + " ");
                    }      System.out.println();
                }
            }

    public static int[] twoArgArray (int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
            }

    public static void minMaxArray () {
        int[] myMinMaxArray = new int[12];

        for (int i = 0; i < myMinMaxArray.length; i++) {
            myMinMaxArray[i] = random.nextInt(20);
            System.out.print(myMinMaxArray[i] + " ");
        }
        int min = myMinMaxArray [0];
        int max = myMinMaxArray [0];
        for (int j = 0; j != myMinMaxArray.length; j++) {
        if (myMinMaxArray[j] < min) {
            min = myMinMaxArray[j];
        }
        if (myMinMaxArray[j] > max) {
            max = myMinMaxArray[j];
        }
    }
        System.out.println("\nМинимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    public static int[] moveArray (int[] mas1,int n) {
        System.out.println("Исходный массив");
        printArray(mas1);
        boolean move;
        if (n < 0) {
            move = true;
            n = -n;
        } else {
            move = false;
        }
        n %= mas1.length;
        int last = mas1.length - 1;
        for (int i = 0; i < n; i++) {
            int temp = (move) ? mas1[0] : mas1[last];
            for (int j = 0; j < last; j++) {
                if (move)
                    mas1[j] = mas1[j + 1];
                else
                    mas1[last - j] = mas1[last - j - 1];
            }
            if (move)
                mas1[last] = temp;
            else
                mas1[0] = temp;
        }
        System.out.println("Массив после передвижения");
        return mas1;

    }}




