package array.ex;

import java.util.Scanner;

public class FinalArrayEx {
    public static void main(String[] args){
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productsPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int menu = scanner.nextInt(); // 10\n에서 10만 가져가고 \n은 남아있다.
            //그래서 아래의 nextLine에 \n이 들어가면서 바로 상품 가격으로 넘어간다
            //이를 방지하기 위해
            scanner.nextLine(); // 여기서 \n을 먹어버린다.

            if (menu == 1) {

                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다. ");
                    continue;

                }
                System.out.print("상품이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품가격을 입력하세요 : ");
                productsPrices[productCount] = scanner.nextInt();

                productCount++;

            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ":" + productsPrices[i]);
                }

            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

    }
}
