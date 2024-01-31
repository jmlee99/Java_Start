package method;

public class Method1 {
    public static void main(String[] args) {
        //계산1
        int a = 1;
        int b = 2;

        System.out.println(a + "+" + b + "연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력 : " + sum1);

        System.out.println("==============");

        //계산2
        int x = 10;
        int y = 20;

        System.out.println(x + "+" + y + "연산 수행");
        int sum2 = x + y;
        System.out.println("결과1 출력 : " + sum2);
        /*
        * 만약 프로그램의 여러곳에서 이런 같은 계산을 반복해야 한다면?
        * 위 처럼 따로따로 계속 작성한다면
        * 아마 코드를 수정할때 엄청 복잡할 것이다.
        * 이럴때 사용하는 것이 Function (함수) 또는 Method 메서드라고 한다.*/
    }
}
