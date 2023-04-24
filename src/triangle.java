import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("첫 번째 변의 길이를 입력하세요: ");
        int a = S.nextInt();

        System.out.print("두 번째 변의 길이를 입력하세요: ");
        int b = S.nextInt();

        System.out.print("세 번째 변의 길이를 입력하세요: ");
        int c = S.nextInt();


        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("입력한 삼각형은 유효한 삼각형입니다.");
        } else {
            System.out.println("입력한 삼각형은 유효하지 않은 삼각형입니다.");
        }

    }
}
