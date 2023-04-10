import com.sun.org.apache.xml.internal.utils.StringVector;

public class arrary {
    public static void main(String[] args) {

        //배열(Arrary) - 여러개의 변수 저장 가능
        int[] price = {1000,200, 3300 };
        String[] mbti = {"INFP", "ENFP"};

        System.out.println(price[0]);
        System.out.println(mbti[0]);

        //배열 원소 변경
        price[1] = 8000;
        System.out.println(price[1]);

        //배열의 주소를 출력함
        System.out.println(price);

        // 배열의 길이 출력
        System.out.println(mbti.length);

        for(int i = 0; i < mbti.length; i++){
            System.out.println(mbti[i]);
        }

    }
}
