package reusing;

class asd {
    asd(){
        System.out.println("hi");
    }
}
public class exercise8 extends asd{
    exercise8(){}
    exercise8(String s) {
        super();
        System.out.println(s);
    }

    public static void main(String[] args) {
        exercise8 x = new exercise8("asdf");
        System.out.println(x);
    }
}
