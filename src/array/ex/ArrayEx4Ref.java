package array.ex;

import java.util.Scanner;

public class ArrayEx4Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        int sum = 0;
        System.out.println("숫자를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;
        System.out.println("출력");
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);

    }
}
