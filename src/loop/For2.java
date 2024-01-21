package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++){
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            /*While2_3과 For2를 비교하면 for문으로 작성하는 코드가 더 좋은 코드이다.
            * 우선 for문이 더 깔끔하다. 초기화 등 한줄에 작성가능
            * i 값이 증가하면서 반복 횟수가 올라가고, 조건식에 활용까지 for문 한줄에서 작성가능
            * while문은 for문에 한 줄에 적은 코드를 여러줄에 작성해야한다.
            * */
        }
    }
}
