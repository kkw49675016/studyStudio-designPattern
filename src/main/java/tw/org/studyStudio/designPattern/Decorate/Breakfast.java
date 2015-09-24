/**
 * 
 */
package tw.org.studyStudio.designPattern.Decorate;

/**
 * @author 	kkw
 * @date   	2015年9月23日 下午2:46:18 
 * @version	
 * @description
 */
public abstract class Breakfast {
	
	public String description;
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();

}
