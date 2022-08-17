
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание №1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание №2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        for (int j : arr) {
            min = Math.min(min, j);
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание №3");
        int[] arr = generateRandomArray();
        double average = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            average = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);
        for (int i = reverseFullName.length-1; i > -1 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}