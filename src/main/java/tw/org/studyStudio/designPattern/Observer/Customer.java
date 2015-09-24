/**
 * 
 */
package tw.org.studyStudio.designPattern.Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 	kkw
 * @date   	2015年9月22日 下午4:20:12 
 * @version	
 * @description
 */
public class Customer implements IObserver{

	private String customerId;
	private String customerEMail;
	private static Logger log = LoggerFactory.getLogger(Customer.class);
	
	/**
	 * 
	 */
	public Customer(String customerId, String customerEMail) {
		// 
		this.customerId = customerId;
		this.customerEMail = customerEMail;
	}
	
	public void recieveMessage(String message) {
		// TODO Auto-generated method stub
		log.info(" Hello {} , Your mail is : {}, and we have new feed : {}", customerId, customerEMail, message);
	}

}
