package training.spring.core.xmlconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class RocketLuncher implements InitializingBean, DisposableBean {

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(TAG + "start initializing the connection with Rocket Engine");
		rocketEngine.initRocketEnging();
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("********");
		System.out.println(TAG + "stop the connection with Rocket Engine");
		rocketEngine.stopEngine();
		System.out.println("********");
	}
}
