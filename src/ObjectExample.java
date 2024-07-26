public class ObjectExample {
    public static void main(String[] args) {
        Integer i = 127;
        Integer j = 127;
        System.out.println(i == j);
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1.equals(str2));
        Class<?> cls=ObjectExample.class;
        System.out.println(cls.getName());
        System.out.println(i.hashCode());

    }
}