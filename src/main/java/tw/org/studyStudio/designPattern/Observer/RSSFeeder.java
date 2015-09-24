/**
 * 
 */
package tw.org.studyStudio.designPattern.Observer;


import java.util.ArrayList;
import java.util.List;

import tw.org.studyStudio.designPattern.Observer.IObserver;

/**
 * @author 	kkw
 * @date   	2015年9月22日 下午4:11:05 
 * @version	
 * @description
 */
public class RSSFeeder implements ISubject{

	/* (non-Javadoc)
	 * @see tw.org.kkw.designPattern.Observer.ISubject#RegisterObserver(tw.org.kkw.designPattern.Observer.IObserver)
	 */
	
	private List<IObserver> observerList;
	
	/**
	 * 
	 */
	public RSSFeeder() {
		// Initial observer list
		observerList = new ArrayList<IObserver>();
	}
	
	public void RegisterObserver(IObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	public void RemoveObserver(IObserver observer) {
		// TODO Auto-generated method stub
		if ( observerList.contains(observer)) {
			observerList.remove(observer);
		}
	}

	public void notifyObserver(String message) {
		// TODO Auto-generated method stub
		for (IObserver iObserver : observerList) {
			iObserver.recieveMessage(message);
		}
	}

}
