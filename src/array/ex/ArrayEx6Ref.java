package array.ex;

import java.util.Scanner;

public class ArrayEx6Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        //minNumber, maxnumber 초기화
        minNumber = maxNumber = numbers[0];

        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("가장 작은 수 : " + minNumber);
        System.out.println("가장 큰 수 : " + maxNumber);
    }
}
