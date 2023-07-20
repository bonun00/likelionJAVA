package challenge;

import basic.Lecturer;
import basic.Person;
import basic.Student;

import java.util.*;

public class ChallengeMain {
    public static void main(String[] args) {
        Person studentKim = new Student("kim",26);
        Person studentLee =new Student("Lee", 28);
        Person studentPark = new Student("Park", 24);

        Person lecturer = new Lecturer("koo bonun", 35);

        List<Person> everyone = new ArrayList<>();
        everyone.add(studentKim);
        everyone.add(studentLee);
        everyone.add(studentPark);
        everyone.add(lecturer);

        printItem(everyone);

//        ArrayList a;
//        LinkedList b;
//        Vector c;
//        HashSet d;
//    // 컨트롤 클릭 코드 설명 볼수 있다
    }
    public  static<T> void  printItem(Iterable<T> iterable){
        Iterator<T> iterator = iterable.iterator();
        if(!iterator.hasNext()){
            System.out.println("No Elements");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        // 문자열 사용시 한번에 다쓰기 힘든것 부분부분 문자열 합칠수 있다
        stringBuilder.append("idx\t\titem\n");
        for(int i = 0; iterator.hasNext(); i++){
            T item = iterator.next();
            stringBuilder.append(
                    String.format("%d\t\t%s\n",i, item.toString()));
        }
        System.out.println(stringBuilder);
    }
}
