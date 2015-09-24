/**
 * 
 */
package tw.org.studyStudio.designPattern.Decorate;

/**
 * @author 	kkw
 * @date   	2015年9月23日 下午2:58:07 
 * @version	
 * @description
 */
public class Ham extends CondimentDecorator {
	
	Breakfast breakFast;
	
	/**
	 * 
	 */
	public Ham(Breakfast breakFast) {
		// TODO Auto-generated constructor stub
		this.breakFast = breakFast;
	}

	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Decorate.Breakfast#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return breakFast.cost() + 10;
	}
	
	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Decorate.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return breakFast.getDescription() + " ,火腿";
	}

}
