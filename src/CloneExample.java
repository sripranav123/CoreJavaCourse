public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1= new Person("pranav" , 18 , 5.5);
        Person p2= (Person) p1.clone();
        System.out.println("original : " + p1 +"\n"+ "duplicate : " + p2);
    }
}