/**
 * 
 */
package tw.org.studyStudio.designPattern.Observer;

/**
 * @author 	kkw
 * @date   	2015年9月22日 下午4:26:08 
 * @version	
 * @description
 */
public class ObserverPatternMain {
	
	public static void main(String[] args) {
		
		//create observer
		Customer customer1 = new Customer("1", "kkw@cht.com.tw");
		Customer customer2 = new Customer("2", "cutewayne2002@gmail.com");
		
		//Initial RSSFeeder
		RSSFeeder rssFeeder = new RSSFeeder();
		
		//Register to RSSFeeder
		rssFeeder.RegisterObserver(customer1);
		rssFeeder.RegisterObserver(customer2);
		
		//Send Message
		rssFeeder.notifyObserver("First Article");
		
		//Remove customer2
		rssFeeder.RemoveObserver(customer2);
		
		//Send Message
		rssFeeder.notifyObserver("Second Article");
	}

}
