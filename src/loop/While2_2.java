package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum += i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;
        sum += i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;
        sum += i;
        System.out.println("i = " + i + " sum = " + sum);
        /*이 방법 역시 코드 수정 및 효율성에 문제가 있다.*/
        /*변수 i를 사용한다. 하지만 i = 1이고 endNum이 10으로 주어지면
         * 이것 역시 불편해진다.*/
    }
}
