package Oops;

public class D_copyConstructor {
    int a;
    D_copyConstructor(int x){ //copy constructor
        this.a = x;
    }
    D_copyConstructor(D_copyConstructor obj){
        this(obj.a);
    }

    public static void main(String[] args) {
        D_copyConstructor ob1 = new D_copyConstructor(10);
        D_copyConstructor ob2 = new D_copyConstructor(ob1);

    }
}
