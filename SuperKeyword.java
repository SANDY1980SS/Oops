package Oops;

public class SuperKeyword {
    public static void main(String[] args) {
      B ob = new B();
      ob.show();
      ob.display();
    }
}
class A{
    int a=10;
    void display(){
        System.out.println("Hi i am a student");
    }
}
class B extends A{
    int a=20;
    void show(){
        super.display();// calling parent method
        System.out.println(a);// using its own variable
        System.out.println(super.a); //using parent's variable
    }
    void display(){
        System.out.println("Hello World");
    }
}
