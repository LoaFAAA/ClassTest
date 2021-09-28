package reusing;


import org.junit.jupiter.api.Test;
import sun.misc.Cleaner;

class Detergent {
    private String s = "cleaner";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()");}
    public void apply() { append(" apply()");}
    public void scrub() { append(" scrub()");}
    public String toString() { return s;}

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

//public class Detergent1 extends Detergent {
//    @Test
//    public void scrub() {
//        append(" Detergent.scrub()");
//        super.scrub();
//    }
//    public void foam (){ append(" foam()");}
//
//    public static void main(String[] args) {
//        Detergent1 s = new Detergent1();
//        s.dilute();
//        s.apply();
//        s.scrub();
//        s.foam();
//        System.out.println(s);
//        System.out.println("Testing base class");
//        Detergent.main(args);
//    }
//}

 class Detergent2 extends Detergent {
    @Test
    public void scrub(){
        append(" Detergent2.scrub()");
    }
    public void sterilize(){ append("sterilize()");}

     public static void main(String[] args) {
         Detergent2 a = new Detergent2();
         a.dilute();
         a.apply();
         a.scrub();
         a.sterilize();
         System.out.println(a);
     }

}
