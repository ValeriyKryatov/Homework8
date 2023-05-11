import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
    }
    public static void task1_2() {
        System.out.println("Задача 1 - 2");
        int[] number1_1 = new int[3];
        number1_1[0] = 1;
        number1_1[1] = 2;
        number1_1[2] = 3;
        for (int i = 0; i < number1_1.length; i++) {
            if (i == number1_1.length - 1) {
                System.out.println(number1_1[i]);
                break;
            }
            System.out.print(number1_1[i] + ", ");
        }
        double[] number1_2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number1_2.length; i++) {
            if (i == number1_2.length - 1) {
                System.out.println(number1_2[i]);
                break;
            }
            System.out.print(number1_2[i] + ", ");
        }
        int[] number1_3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < number1_3.length; i++) {
            if (i == number1_3.length - 1) {
                System.out.println(number1_3[i]);
                break;
            }
            System.out.print(number1_3[i] + ", ");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] number1_1 = new int[3];
        number1_1[0] = 1;
        number1_1[1] = 2;
        number1_1[2] = 3;
        for (int i = number1_1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(number1_1[i]);
                break;
            }
            System.out.print(number1_1[i] + ", ");
        }
        double[] number1_2 = {1.57, 7.654, 9.986};
        for (int i = number1_2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(number1_2[i]);
                break;
            }
            System.out.print(number1_2[i] + ", ");
        }
        int[] number1_3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = number1_3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(number1_3[i]);
                break;
            }
            System.out.print(number1_3[i] + ", ");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] number1_1 = new int[3];
        number1_1[0] = 1;
        number1_1[1] = 2;
        number1_1[2] = 3;
        for (int i = 0; i < number1_1.length; i++) {
            if (number1_1[i] % 2 != 0) {
                number1_1[i]++;
            }
        }
            System.out.println(Arrays.toString(number1_1));
        }
    }