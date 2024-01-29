package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성
        //자바는 배열을 생성할 때 그 내부값을 자동으로 초기화한다.
        //숫자는 0, boolean은 false, string은 null

        System.out.println(students); //결과값 :[I@8efb846이런 형태이다.
        // I는 int형이라는 소리고 @뒤의 16진수는 참조값을 뜻한다.

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("학생1 점수 :" + students[0]);
        System.out.println("학생1 점수 :" + students[1]);
        System.out.println("학생1 점수 :" + students[2]);
        System.out.println("학생1 점수 :" + students[3]);
        System.out.println("학생1 점수 :" + students[4]);

    }
}
