package scanner.ex;
import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요 :");
        String menu = input.nextLine();

        System.out.println("음식의 가격을 입력해주세요 :");
        int price = input.nextInt();

        System.out.println("음식의 수량을 입력해주세요 :");
        int count = input.nextInt();

        int totalPrice = price * count;

        System.out.println(menu +" "+ count + "개를 주문하였습니다. 총 가격은 " + totalPrice + "입니다.");
    }
}
