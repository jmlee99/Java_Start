package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        /*전위 후위 증감 연산자
        - 증감 연산자는 피연산자 앞에 두거나 뒤에 둘 수 있으며, 연산자의 위치에 따라 연산이 수행되는 시점이 달라진다.
        * ++a : 증감 연산자를 피연산자 앞에 둘 수 있다. 이것을 앞에 있다고 해서 전위 증감 연산자라 한다.
        * a++ : 증감 연산자를 피연산자 뒤에 둘 수 있다. 이것을 뒤에 있다고 해서 후위 증감 연산자라 한다.
        * ++a : 값을 먼저 증가 시켜
        * a++ : 출력 하고 값을 증가 시켜*/
        //전위 증감 연산자 예시
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        //후위 증감 연산자 예시
        a = 1;
        b = 0;
        b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);
    }
}
