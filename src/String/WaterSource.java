package String;

public class WaterSource {
     String s;
//    WaterSource() {
//        System.out.println("WaterSource()");
//        s = "constructed";
//    }
    public String toString() { return s;}
}

class water {
    public static void main(String[] args) {
        WaterSource a = new WaterSource();
        if (a.s == null)
            a.s = "constructing";
        System.out.println(a.s);
    }

}
