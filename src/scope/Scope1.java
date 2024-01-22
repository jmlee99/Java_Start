package scope;

public class Scope1 {
    /*지역 변수 변수가 선언된코드 블럭{}안에서만 사용가능한 변수*/
    public static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("m = " + m);
            System.out.println("x = " + x);
        } // x는 생존 종료
        //System.out.println("main x = " + x); // 오류 x 접근 불가
        System.out.println("main m = " + m);
    }// m 생존 종료
}
