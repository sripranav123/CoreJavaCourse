import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args){
        List<Person> people= new ArrayList<>();
        people.add(new Person("Pranav" , 18 , 5.5));
        people.add(new Person("ramakanth" , 40 , 5.7));
        people.add(new Person("srikanth" , 52 , 5.9));
        people.add(new Person("tulip" , 20, 5.6));
        people.add(new Person("abhi" , 19 , 5.7));
        Comparator<Person> ageComparator=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int ageCompare=Integer.compare(o1.getAge(), o2.getAge());
                if(ageCompare!=0)
                    return ageCompare;
                else
                    return Double.compare(o1.getHeight() , o2.getHeight());
            }
        };
        Collections.sort(people , ageComparator);
        for(Person p1 : people){
            System.out.println(p1);
        }
        Comparator<Person> heightComparator= new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getHeight() , o2.getHeight());
            }
        };
        Collections.sort(people , heightComparator);
        for(Person p1:people){
            System.out.println(p1);
        }
    }
}
