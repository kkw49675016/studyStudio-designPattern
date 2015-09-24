/**
 * 
 */
package tw.org.studyStudio.designPattern.Decorate;

/**
 * @author 	kkw
 * @date   	2015年9月23日 下午2:54:48 
 * @version	
 * @description
 */
public class Cheese extends CondimentDecorator {
	
	Breakfast breakFast;
	
	/**
	 * 
	 */
	public Cheese(Breakfast breakfast) {
		// TODO Auto-generated constructor stub
		this.breakFast = breakfast;
	}

	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Decorate.Breakfast#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return breakFast.cost() + 5;
	}
	
	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Decorate.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return breakFast.getDescription() + " ,起司";
	}

}
