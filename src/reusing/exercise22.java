package reusing;

class SmallBrain {}

final class Dinosaur {
    SmallBrain x = new SmallBrain();
}

// class Further extends Dinosaur {} // error: cannot inherit from final Dinosaur

public class exercise22 {
    public static void main(String[] args) {
        Dinosaur d = new Dinosaur();
    }
}