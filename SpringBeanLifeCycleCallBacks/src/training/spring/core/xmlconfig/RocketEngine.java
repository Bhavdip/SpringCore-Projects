package training.spring.core.xmlconfig;

public class RocketEngine {

	public static String TAG = "[RocketEngine]\t";
	
	public RocketEngine() {
		System.out.println("********");
		System.out.println(TAG + "constructor has been created");
		System.out.println("********");
	}
	
	public void initRocketEnging() {
		System.out.println(TAG + "Engine initiation process has been started.....");
	}
	
	public void startEngine() {
		System.out.println(TAG + "Engine is started.....");
	}
	
	public void stopEngine() {
		System.out.println(TAG + "Engine is stopped.....");
	}
}
