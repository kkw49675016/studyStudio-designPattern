/**
 * 
 */
package tw.org.studyStudio.designPattern.Decorate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 	kkw
 * @date   	2015年9月23日 下午3:00:11 
 * @version	
 * @description
 */
public class BreakfastMain {
	
	private static Logger log = LoggerFactory.getLogger(BreakfastMain.class);
	public static void main(String[] args) {
		Breakfast breakfast = new Burger();
		breakfast = new Ham(breakfast);
		breakfast = new Cheese(breakfast);
		
		log.info("[INFO] 客人點了 : {} , 總共花費 : {} ", breakfast.getDescription(), breakfast.cost());
		
	}

}
