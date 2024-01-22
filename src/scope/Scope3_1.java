package scope;

public class Scope3_1 {
    /*이러한 변수라는 개념이 존재하는 이유
    * 밑에 코드는 좋은 코드라고 보기 힘들다.
    * 임시변수 temp는 if문 안에서만 사용하고 존재하면 되는 변수이다.
    * 이렇게 되면 비효율적인 메모리를 사용하게 된다.
    * 그럼 효율적인 메모리 사용을 위해 밑에 코드를 Scope3_2로 바꿔보자
    * 나말고 다른 사람이 유지보수를 할때도 이러한 불필요한 선언은 좋은게 아니다.*/
    public static void main(String[] args){
        int m = 10;
        int temp = 0;
        if (m > 0){
            temp = m + 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
        /*저번에 했던 파일을 찾을려면 Ctrl + n
        * 바로 이전 꺼로 돌아가고 싶으면 Ctrl + e + Enter*/
    }
}
