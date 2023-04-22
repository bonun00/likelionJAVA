import java.util.ArrayList;

public class list {
    public static void main(String[] args) {

        // 순서 구분, 중복허용
        // Vector, ArrayList, LinkedList
        // ArrayList <- 배열 보다 유연하게 다룰 수 있다
        //<> 리스트 제한조건
        ArrayList<Integer> list = new ArrayList(10);
        list.add(100);
        //list.add("INFP");
        //size -길이를 표현
        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }

    }
}


