package training.spring.core.xmlconfig2;

public class RocketLuncher {

	public static String TAG = "[RocketLuncher]\t";
	
	public RocketEngine rocketEngine;
	
	public RocketLuncher() {
		System.out.println("********");
		System.out.println(TAG + "constructor has been created");
		System.out.println("********");
	}
	
	public void setRocketEngine(RocketEngine rocketEngine) {
		this.rocketEngine = rocketEngine;
		System.out.println("********");
		System.out.println(TAG + "RocketEngine injection has completed");
		System.out.println("********");
	}

	public void startLunchRocket() {
		rocketEngine.startEngine();
	}
	
	public void stopLunchPad() {
		rocketEngine.stopEngine();
	}

	
	public void initRocketLuncher() {
		System.out.println(TAG + "start initializing the connection with Rocket Engine");
		rocketEngine.initRocketEnging();
	}
	
	public void destroyRocketLuncher() {
		System.out.println("********");
		System.out.println(TAG + "stop the connection with Rocket Engine");
		rocketEngine.stopEngine();
		System.out.println("********");
	}
}
