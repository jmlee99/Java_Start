package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("2. changeNumber 호출 후, num1: " + num1);
    }

    public static int changeNumber(int num2){
        num2 = num2 * 2;
        return num2;
        /*이렇게 하면 main문 안의 변수의 값을 변환 시킬 수 있다.
        * 참고로 뒤에서 참조형이라는 것을 학습하는데, 이때도 똑같다. 결국
        * 참조형 변수에 있는 값인 참조값을 복사하는 것이다!
        * 이것은 나중에 알아본다.*/
    }
}
