public class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println(summResult(5, 15));
        print(0);
        System.out.println(myMath(-7));
        printStringInt("test", 7);
        System.out.println(leapYear(2020));

    }

    public static boolean summResult(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else if (x < 0) {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean myMath(int y) {
        if (y >= 0) {  // 0 также считаем положительным числом
            return false;
        } else {
            return true;
        }
    }

    public static void printStringInt(String line, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(line);
        }
    }

    public static boolean leapYear (int year) {
        double y = year % 4;
        double z = year % 400;
        double v = year % 100;
        if (y == 0 ) {
            if (v == 0) {
                if (z == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

//    public static boolean leapYear (int year) {
//            if (year%4==0){
//                if (year%100==0){
//                    if (year%400==0){
//                        return true;
//                    }
//                    return false;
//                }
//                return true;
//            }
//            return false;
//        }
}
