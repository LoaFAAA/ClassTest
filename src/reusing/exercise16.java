package reusing;
class Frog {
    void play() {
        System.out.println("hi,i am playing");
    }
    static void play(Frog g) {
        g.play();
    }
}
public class exercise16 extends Frog{
    public static void main(String[] args) {
        exercise16 m = new exercise16();
        Frog.play(m);
    }
}
