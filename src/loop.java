import java.util.concurrent.SynchronousQueue;

public class loop {
    //for(초기화된 변수 , 조건식, 증감식)
    public static void main(String[] args) {
        for (int i = 0; i < 10; i= i + 2)
            System.out.println(i);
    }
}
