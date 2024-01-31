package method;

public class MethodValue0 {

    /*
    * 메서드 호출과 값 전달 1
    * 지금부터 자바에서 아주 중요한 대원칙 하나를 말한다.!!!!!매우 중요!!!!!
    * 자바는 항상 변수의 값을 복사해서 대입한다.
    * 이 대원칙은 반드시 이해해야 한다. 그러면 아무리 복잡한 상황에도 코드를 단순하게 이해할 수 있다.
    * */
    public static void main(String[] args){
        int num1 = 5;
        int num2 = num1;
        num2 = 10;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }


}
