package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        /*문제 : "학점 계산하기
        * - 90점 이상 "A"
        * - 80점 이상 90점 미만 "B"
        * - 70점 이상 80점 미만 "C"
        * - 60점 이상 70점 미만 "D"
        * - 60점 미만 "F"
        * 점수는 변수 int score로 지정하고, 해당 변수를 기반으로 학점을 출력하자
        */
        int score = 85;

        if (score >= 90){
            System.out.println("학점음 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점음 B입니다.");
        } else if (score >= 70){
            System.out.println("학점음 C입니다.");
        } else if (score >= 60){
            System.out.println("학점음 D입니다.");
        } else{
            System.out.println("학점음 F입니다.");
        }

    }
}
