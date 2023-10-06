//import java.util.HashSet;
//import java.util.Objects;
//
//public class Main {
//    public static void main(String[] args) {
//        HashSet set = new HashSet();
//
//        set.add("abc");
//        set.add("abc");
//        set.add(new Person("David",10));
//        set.add(new Person("David",10));
//
//        System.out.println(set);
//    }
//}
//class Person {
//    String name;
//    int age;
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age =age;
//    }
//
//    public String toString() {
//        return name+":"+age;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//}