package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // ArrayDi0 부터 한 단계씩 코드를 최적화 시키는 코드를 만든다.
        int[][] arr = new int[3][4];// 이 부분만 코치면 우리가 원하는 2dArray를 만들 수 있다.

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col ++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
