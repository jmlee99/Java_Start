package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        /*조건에 만족하지 않아도 한 번은 출력을 해야할 때*/
        int i = 10;
        do{
            System.out.println("i = " + i);
        }while (i < 3);
    }
}
