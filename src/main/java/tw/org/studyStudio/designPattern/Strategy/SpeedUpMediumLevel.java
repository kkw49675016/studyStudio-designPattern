/**
 * 
 */
package tw.org.studyStudio.designPattern.Strategy;

/**
 * @author 	kkw
 * @date   	2015年9月23日 上午10:38:24 
 * @version	
 * @description
 */
public class SpeedUpMediumLevel implements ISpeedUp{

	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Strategy.ISpeedUp#speedUpLevel()
	 */
	public int speedUpLevel() {
		return 4;
	}

}
