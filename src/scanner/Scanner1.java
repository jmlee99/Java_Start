package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 :");
        String str = scanner.nextLine(); // 입렷을 String으로 가져온다.
        System.out.println("입력한 문자열 :" + str);


        System.out.print("정수를 입력하세요 :");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : " + intValue);

        System.out.print("실수를 입력하세요 :");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleValue);
            /*Input의 타입을 맞춰줘야한다. Input Type가 안맞으면 오류가 발생한다.*/
    }
}
