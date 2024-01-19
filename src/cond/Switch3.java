package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        /*break문이 없으면 어떻게 되는지 확인
        * 만약 grade 2와 3모두 3000원 쿠폰을 지급한다고 한다.*/
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2: // case2에 왔지만 break가 없기 떄문에 case3를 실행한다.
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
