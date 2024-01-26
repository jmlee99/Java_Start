package scanner.ex;
import java.util.Scanner;
public class ScannerWhileEx3 {
    public static void main(String[] args){
        int sum = 0, count = 0, number = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
/*        while (true) {
            int number = input.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
            count++;

        }*/

        while ((number = input.nextInt()) != -1) {
            sum += number;
            count++;
        }
        double average = (double) sum / count; // int와 int연산이기 때문에
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }
}
