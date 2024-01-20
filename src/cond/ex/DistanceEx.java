package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        /*문제 : 거리에 따른 운송 수단 선택하기
        * 거리가 1km 이하이면 "도보"
        * 거리가 10km 이하이면 "자전거"
        * 거리가 100km 이하이면 "자동차"
        * 거리가 1000km 이하이면 "비행기"
        * 거리는 변수 int distance로 지정하고, 해당 변수를 기반으로 운송 수단을 출력하자.
        * */
        int distance = 25;

        if (distance <= 1){
            System.out.println("도보를 이용");
        } else if (distance <= 10){
            System.out.println("자전거를 이용");
        } else if (distance <= 100){
            System.out.println("자동차를 이용");
        } else{
            System.out.println("비행기");
        }
    }
}
