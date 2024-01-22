package casting;

public class Casting1 {
    public static void main(String[] args) {
        /*자동 형변환
         * 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.
         * 큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있다.
         * */

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long => double
        System.out.println("doubleValue = " + doubleValue);

    }
}
