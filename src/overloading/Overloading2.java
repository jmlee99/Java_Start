package overloading;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2, 1);
    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b){
        System.out.println("double a, int b");
    }

    /*
    * 정수 실수를 호출했으므로 위에 메서드가
    * 실수 정수를 호출하면 아래 메서드가 호출되는 것을 볼 수 있다.
    * */
}
