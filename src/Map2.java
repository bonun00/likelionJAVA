import java.util.ArrayList;

public class Map2 {
    public static void main(String[] args) {

        ArrayList list_1 = new ArrayList<>();
        list_1.add(10);
        list_1.add(100);

        printListElements(list_1);

        //불필요한 반복작업이나 함수가 길어질때 이용

    }

    static void printListElements(ArrayList list){

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
