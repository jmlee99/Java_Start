package method;

public class methodCasting2 {
    /*
    * MethodCasting1은 명시적 형변환
    * MethodCasting2는 자동 형변환을 다룬다.
    * */
    public static void main(String[] args){
        int number = 100;
        printNumber(number);
    }

    public static void printNumber(double n){
        System.out.println("숫자 :" + n);
    }
}
