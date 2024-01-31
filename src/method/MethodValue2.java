package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }

    public static void changeNumber(int number){
        System.out.println("2. changeNumber 변경 전, number: " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number);

        /*매개 변수 이름이 둘다 number로 똑같지만 각각의 메서드 안에서 사용하는 변수들은
        * 이름이 같아도 완전히 다른 변수이다. 완전히 다른 공간에서 생성된 것이다.
        * 이렇게 똑같은 변수이름을 쓰는 것은 좋은 것이 아니다.*/
    }
}
