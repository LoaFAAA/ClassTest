package reusing;

class Game {
    Game(int i) {
        System.out.println("Game constructor" + i);
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        // print("BoardGame constructor"); // call to super must be first
        // statement in constructor
        super(i); // else: "cannot find symbol: constructor Game()
        System.out.println("BoardGame constructor" + i);
    }
}

public class exercise6 extends BoardGame {
    exercise6() {
        super(11);
        System.out.println("Chess constructor" );
    }
    public static void main(String[] args) {
        exercise6 x = new exercise6();
    }
}