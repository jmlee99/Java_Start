package variable;

public class Var1 {
    public static void main(String[] args) {
        System.out.println(10); // 변경 10 -> 20
        System.out.println(10); // 변경 10 -> 20
        System.out.println(10); // 변경 10 -> 20
    }
}

/*숫자 10이라고 적혀 잇는 곳을 모두 찾아서 숫자 20으로 변경해야 한다. 여기서는 총 3번의 코드 변경이 발생했다.
* 이러한 문제를 해결하기 위해 변수라는 기능을 제공한다. 변수는 이름 그대로 변할 수 있다는 뜻이다.*/
