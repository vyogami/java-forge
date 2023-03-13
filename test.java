

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("Shivam", 21);
        Person p2 = new Person("Shivam", 21);
        Person p3 = p1;

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        System.out.println(p1.equals(p3));
    }
}

class Person{
    private String name;
    private int age;
    

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void hello(){
        System.out.println("Hello");
    }
}