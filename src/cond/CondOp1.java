package cond;

public class CondOp1 {
    /*삼항 연삱자*/
    public static void main(String[] args) {
        int age = 10;
        String status;
        if ( age >= 18){
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + ", status = " + status);
        /*이러한 단순 참 거짓을 판별하는 코드는 삼항 연산자를 사용할 수 있다.*/
    }
}
