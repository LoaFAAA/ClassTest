package reusing;

public class exercise12 {
}
class Component11 {
    Component11(String s) {
        System.out.println(s); }
    void dispose() {
        System.out.println(" disposed!");
    }
}

class Component22 {
    Component22(String s) { System.out.println(s); }
    void dispose() {
        System.out.println(" disposed!");
    }
}

class Component33 {
    Component33(String s) { System.out.println(s); }
    void dispose() {
        System.out.println(" disposed!");
    }
}

class Root1 {
    Component11 c1root;
    Component22 c2root;
    Component33 c3root;
    Root1() {
        System.out.println("Root()"); }
    void dispose() {
        System.out.println(" disposed!");
    }
}

class stem1 extends Root1 {
    Component11 c1root;
    Component22 c2root;
    Component33 c3root;

    stem1() {
        Component11 c1root = new Component11("asd");
        Component22 c2root = new Component22("asd");
        Component33 c3root = new Component33("asd");
        System.out.println("stem()");
    }
    void dispose() {
        c1root.dispose();
        c2root.dispose();
        c3root.dispose();
        System.out.println(" stem.disposed!");
    }

    public static void main(String[] args) {
        stem1 m = new stem1();
        try {

        }finally {
            m.dispose();
        }
    }
}