package reusing;

class BasicDevice {
	private String s = "Original";
	public BasicDevice() {	s = "Original"; }
	protected void changeS(String c) { // outside package, only derived
		s = c;			// classes can access protected method
	}
	public void showS() {
		System.out.println(s);
	}
}

class DeviceFail {
    public static void main(String[] s) {
        BasicDevice fail = new BasicDevice();
        fail.showS();
        // fail.changeS("good-bye"); // cannot access protected method 	
    }
}

public class Device extends BasicDevice {
    void changeBasic(String t) {
        super.changeS(t); // calls protected method
    }
    public static void main(String[] args) {
        Device d = new Device();
        d.showS();
        d.changeBasic("Changed"); // derived class can access protected
        d.showS();

    }
}