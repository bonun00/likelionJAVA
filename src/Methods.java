public class Methods {
    // 함수 (메서드) : 자바에서는 모든것이 클래스로 관리하여 메서드라는 이름으로 통용
    // 어떠한 값이 넘겨지거나 아무 값도 넘겨지지 않았을때
    // 작업을 수행한 후 반환하거나
    // 반환하지 않고 종료
    public static void main(String[] args) {

        int mod_result = mod(3,2);
        System.out.println(mod_result);

        printnum(10);

        String str = greeting();
        System.out.println(str);

        greeting_2();


    }
    // 1. 입력 o , 출력 o
    static int mod(int a, int b) {
        int result = a % b;
        return result;
        // 반환되는 타입이 함수의 데이터 타입 이어야 한다
    }

    // 2.입력 o, 출력(반환)x
    static void printnum (int a ){
        System.out.println(a);
        // a라는 데이터는 출력후 사라진다
    }
    //3. 입력 X, 출력 o
    static String greeting(){
        return "Hello";

    }
    //4.입력X, 출력X
    static void greeting_2(){
        System.out.println("Hello!");
    }

}
