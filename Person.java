package Oops;
//Objects and Class

public class Person {
    String name = "Shadab";
    int age = 20;
    float height = 168.4F;
    void course(){
        System.out.println("I am a B.tech student");
    }
    void sports(){
        System.out.println("I play Basketball");
    }
    public static void main(String[] args) {
        Person ob = new Person();
        System.out.println(ob.name);
        System.out.println(ob.age);
        System.out.println(ob.height);
        ob.sports();
        ob.course();

    }
}
