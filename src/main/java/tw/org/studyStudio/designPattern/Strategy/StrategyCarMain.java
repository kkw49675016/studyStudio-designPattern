/**
 * 
 */
package tw.org.studyStudio.designPattern.Strategy;

import java.awt.CardLayout;

/**
 * @author 	kkw
 * @date   	2015年9月23日 上午11:09:52 
 * @version	
 * @description
 */
public class StrategyCarMain {
	
	public static void main(String[] args) {
		
		PorscheCar porsheCar = new PorscheCar(new SpeedUpMediumLevel(), new SpeedDownLowLevel());
		
		porsheCar.showSpeed();
		porsheCar.accelerate();
		porsheCar.accelerate();
		porsheCar.showSpeed();
		porsheCar.decelerate();
		porsheCar.showSpeed();
		
	}

}
