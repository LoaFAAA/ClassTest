package reusing;

class Component1 {
    Component1(String s) {
        System.out.println(s); }
}

class Component2 {
    Component2(String s) { System.out.println(s); }
}

class Component3 {
    Component3(String s) { System.out.println(s); }
}

class Root {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;
    Root() { System.out.println("Root()"); }
}

class stem extends Root {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;

    stem() {
        Component1 c1root = new Component1("asd");
        Component2 c2root = new Component2("asd");
        Component3 c3root = new Component3("asd");
        System.out.println("stem()");
    }

    public static void main(String[] args) {
        stem m = new stem();
    }
}