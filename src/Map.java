import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        //map
        // 키 - 값 쌍을 요소로 가지는 데이터 모음, 순서 구분 없음
        // 키는 중복 불가, 값을 중복 허용
        //<> 데이터 타입 설정
        HashMap<String, String> map = new HashMap();
        map.put("age", "30");
        map.put("mbti", "INFP");

        System.out.println(map.get("age"));
    }
}
