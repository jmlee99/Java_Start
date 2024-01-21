package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNmum = 100;

        while (i <= endNmum){
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
