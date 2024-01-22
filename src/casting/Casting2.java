package casting;

public class Casting2 {
    public static void main(String[] args) {
        /*큰 범위에서 작은 범위로 형변환
        * - 명시적 형변환 -
        * */
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println("intValue = " + intValue);

        System.out.println((int) 10.5); // "10"이 출력된다. 명시적 형변환

        /*doubleValue를 형변환 하더라도 1.5가 그대로 들어있다.
        * 즉, 형변환을 한다고 doubleValue의 타입이 바뀌지는 않는다.*/
    }
}
