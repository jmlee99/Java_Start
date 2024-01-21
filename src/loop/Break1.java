package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 1000){
                System.out.println("i = " + i + " sum = " + sum);
                break;
            }
            i++;
            /*break문은 가장 가까운 반복문을 탈출하는 구문이다.*/
        }
    }
}
