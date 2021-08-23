
public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		osf.getInstance("open").spec();
	}
}
