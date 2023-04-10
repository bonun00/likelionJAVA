public class Conditional {

    public static void main (String[] args) {

        int a = 1;
        int b = 100;
        //  다중 조건의 경우 조건을 만족하는 최초의 분기만 실행
        // 순서 중요
        if (a == b){
            System.out.println("a !=b");
        } else if (a < b){
            System.out.println("a < b");
        }else{
            System.out.println("else");
        }
    }
}
