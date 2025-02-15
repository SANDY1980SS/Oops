package Oops;

public class C_privateConstructor {
    private C_privateConstructor(){ // private constructor
        System.out.println("I am a private Constructor");
    }

    public static void main(String[] args) {
        C_privateConstructor ob = new C_privateConstructor();
    }
}
