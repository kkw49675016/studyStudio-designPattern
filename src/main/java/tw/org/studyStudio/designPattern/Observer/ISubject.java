/**
 * 
 */
package tw.org.studyStudio.designPattern.Observer;

import java.awt.image.ImageObserver;

/**
 * @author 	kkw
 * @date   	2015年9月22日 下午4:05:36 
 * @version	
 * @description
 */
public interface ISubject {
	
	void RegisterObserver(IObserver observer);
	void RemoveObserver(IObserver observer);
	void notifyObserver(String message);

}
