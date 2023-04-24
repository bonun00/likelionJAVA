import java.util.Scanner;
public class times_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단을 출력할지 입력하세요 : ");
        int num = sc.nextInt();
        times_table(num);
    }

    public static void times_table (int n) {
        for (int i = 1; i <= 9; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
