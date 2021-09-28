package reusing;
class Poppet {
    private int i;
    Poppet(int k) { i = k; }
    public String toString() {
        return ("Poppet " + i);
    }
}

public class exercise19 {
    private final Poppet p; // Blank final reference
    // Blank finals MUST be initialized in the constructor:
    public exercise19() {
        p = new Poppet(1); // Initialize blank final reference
    }
    public exercise19(int x) {
        p = new Poppet(x); // Initialize blank final reference
    }
    public static void main(String[] args) {
        exercise19 b1 = new exercise19();
        exercise19 b2 = new exercise19(47);
        // b1.p = new Poppet(2); // Errors: cannot assign values
        // b2.p = new Poppet(3); // to final variables p
        System.out.println("b1.p: " + b1.p);
        System.out.println("b2.p: " + b2.p);
    }
}