/**
 * 
 */
package tw.org.studyStudio.designPattern.Strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 	kkw
 * @date   	2015年9月23日 上午11:00:27 
 * @version	
 * @description
 */
public class PorscheCar extends ICar{

	private Logger log = LoggerFactory.getLogger(PorscheCar.class);
	
	private ISpeedUp speedUp;
	private ISpeedDown speedDown;
	private int speed;
	/**
	 * 
	 */
	public PorscheCar(ISpeedUp speedUp, ISpeedDown speedDown) {
		// TODO Auto-generated constructor stub
		this.speed = 60;
		this.speedUp = speedUp;
		this.speedDown = speedDown;
	}
	
	public void accelerate(){
		log.info(" [INFO] 加速！增加 {} km/hr. ", speedUp.speedUpLevel());
		speed += speedUp.speedUpLevel();
	}
	
	public void decelerate(){
		log.info(" [INFO] 減速! 減少 {} km/hr. ", speedDown.speedSlowDownLevel());
		speed += speedDown.speedSlowDownLevel();
	}
	
	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Strategy.Car#showSpeed()
	 */
	public void showSpeed() {
		log.info(" [INFO]目前車速 : {}", speed);
		
	}

}
