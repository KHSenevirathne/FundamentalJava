package inharitance;

public class Demo {
    public static void main(String[] args) {
        B b = new B(2);

    }
}


class A{
    A(){
        System.out.println("A");
    }

    A(int x){
        System.out.println("d");
    }
}

class B extends A{
    B(){
        System.out.println("B");
    }

    B(int x){
        System.out.println("c");
    }
}