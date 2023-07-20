package basic;

import java.util.ArrayList;
import java.util.List;

public class BasicMain {
    public static void main(String[] args) {
        Person studentKim = new Student("kim",26);
        Person studentLee =new Student("Lee", 28);
        Person stuentPark = new Student("Park", 24);

        Person lecturer = new Lecturer("koo bonun", 35);

        List<Person> everyone = new ArrayList<>();
        everyone.add(studentKim);
        everyone.add(studentLee);
        everyone.add(stuentPark);
        everyone.add(lecturer);


        for(Person person: everyone){
            person.speak();
        }
    }
}
