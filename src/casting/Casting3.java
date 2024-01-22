package casting;

public class Casting3 {
    /*형변환과 오버플로우
    * 형변환을 할 때 만약 작은 숫자가 표현할 수 있는 범위를 넘어서면 어떻게 될까?*/
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxintValue casting " + intValue);


        intValue = (int) maxIntOver;
        System.out.println("maxintOver casting " + intValue);
        /*int가 담을 수 있는 최대값을 초과한 값을 넣으면,
         int의 젤 작은 숫자부터 다시 시작한다. 이러한 Overflow가 발생한다.*/
    }
}
