/**
 * 
 */
package tw.org.studyStudio.designPattern.Strategy;

/**
 * @author 	kkw
 * @date   	2015年9月23日 上午10:34:35 
 * @version	
 * @description
 */
public class SpeedUpLowLevel implements ISpeedUp{

	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Strategy.ISpeedUp#speedUpLevel(int)
	 */
	public int speedUpLevel() {
		return 2;
	}

}
