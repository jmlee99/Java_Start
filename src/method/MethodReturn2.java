package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }
    public static void checkAge(int age) {

        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가합니다.");
            return; // return을 만나면 그 메서드는 끝난다.
        }

        System.out.println(age + "살로, 입장가능합니다.");

    }
}
