package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        Average(1,2,3);
        Average(15,25,35);
    }

    public static void Average(int a, int b, int c) {
        int sum = a + b + c;
        double average = (double) sum / 3;
        System.out.println("평균값 : " + average);
    }
}
