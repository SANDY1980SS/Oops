package Oops;

public class B_parametriseConstructor {
    B_parametriseConstructor(int x,int y){ //parametrised constructor
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        B_parametriseConstructor ob = new B_parametriseConstructor(20,30);
    }
}
