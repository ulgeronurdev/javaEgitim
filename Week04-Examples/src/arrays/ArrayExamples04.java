package arrays;

import java.util.Scanner;

public class ArrayExamples04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi uzunluğunu seçiniz Tuğçem: ");
        int arrayLength = scanner.nextInt();
        int[] age2 = new int[arrayLength];

        System.out.println(age2.length);

    }
}
