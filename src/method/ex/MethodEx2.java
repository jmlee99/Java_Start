package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        For(3);
        For(5);
        For(7);

    }

    public static void For(int n){
        String message = "Hello world";

        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
        System.out.println("=============");
    }
}
