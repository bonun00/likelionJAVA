public class Conditional2 {

    public static void main(String[] args) {


    int a = 10;
// 스위치문에서는 조건문을 완료했어도 종료 되지 않기 때문에 break를 꼭 이용
        // 디폴트값 - 아무 케이스도 만족 시키지 못했을 떄 출력
    switch (a +1){

        case 11:
            System.out.println("a + 1 = 11");
            break;
        case 10:
            System.out.println("a + 1 = 10");
            break;
        case 9:
            System.out.println("a + 1 = 9");
            break;
        default:
            System.out.println("default");
    }

}
}
