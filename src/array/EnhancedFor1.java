package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        /*
        * 향상된 for문
        * 앞서 반복문에서 설명하지 않은 내용이 하나 있는데, 바로 향상된 for문(Enhance For Loop)이다.
        * 향상된 for문을 이해하려면 배열을 먼저 알아야한다. 각각의 요소를 탐색한다는 의미로 for-each문이라고도 많이 부른다.
        * 향상된 for문은 배열을 사용할 때 기존 for문 보다 더 편리하게 사용할 수 있다.
        * */

        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문 **단축키는 iter + enter**
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each를 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는 : " + numbers[i]);
        }
    }
}
