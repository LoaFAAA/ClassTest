package reusing;

class a {
    void pr(int i){
        System.out.println(i);
    }
}

class b extends a {
    void pr(String s){
        System.out.println(s);
    }
}
class c extends  b {
    void pr(String a,int b){
        System.out.println(a + b);
    }
}
public class exercise13 extends c{
    void pr(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        exercise13 m = new exercise13();
        m.pr();
        m.pr(5);
        m.pr("asd");
        m.pr("as" + 6);
    }

}
