package reusing;

import java.sql.SQLOutput;

class A { A(String s){

    System.out.println(s);
}

    A() {
    }
}

class B extends A{ B(String b){
        super("aaaa");
        System.out.println(b);
    }}

class C extends A {

    C(){
        super("aaa");
        System.out.println("c");
    }
    public static void main(String[] args){
        B bb = new B("asd");
        C c = new C();
    }


}

//public class exercise4 extends C{
//    exercise4() {
//        System.out.println("constructed");
//    }
//    public static void main(String[] args) {
//        exercise4 s = new exercise4();
//
//        System.out.println(s);
//    }
//
//}
