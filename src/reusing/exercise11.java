package reusing;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()");}
    public void apply() { append("  apply()");}
    public void scrub() { append("  scrub()");}
    public String toString() { return s;}
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        System.out.println(x);
    }
}
public class exercise11 {
    private String s = "DetergentDelegation";
    Cleanser c = new Cleanser();
    public void append(String a) { s += a;}
    public void dilute() {
        c.dilute();
    }
    public void apply() {
        c.apply();
    }
    public void scrub() {
        append("DetergentDelegation.scrub()");
        c.scrub();
    }
    public void foam() { append(" foam()"); }
    public String toString() { return s + "  " + c; }
    public static void main(String[] args) {
        exercise11 x = new exercise11();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
