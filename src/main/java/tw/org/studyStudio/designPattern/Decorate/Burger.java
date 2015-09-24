/**
 * 
 */
package tw.org.studyStudio.designPattern.Decorate;

/**
 * @author 	kkw
 * @date   	2015年9月23日 下午2:51:41 
 * @version	
 * @description
 */
public class Burger extends Breakfast {
	
	/**
	 * 
	 */
	public Burger() {
		// TODO Auto-generated constructor stub
		this.description = "漢堡";
	}

	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Decorate.Breakfast#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 15;
	}

}
