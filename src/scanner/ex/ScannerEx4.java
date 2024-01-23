package scanner.ex;
import java.util.Scanner;
public class ScannerEx4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력하고 싶은 단의 숫자를 적어주세요:");
        int Gugudan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            int result = Gugudan * i;
            System.out.println(Gugudan + "*" + i + "=" + result);
        }

    }
}
