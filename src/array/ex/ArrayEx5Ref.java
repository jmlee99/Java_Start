package array.ex;

import java.util.Scanner;

public class ArrayEx5Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 갯수를 입력하세요 : ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

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
