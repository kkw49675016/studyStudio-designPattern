package tw.org.studyStudio.designPattern.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author 	kkw
 * @date   	2015年9月22日 下午2:25:26 
 * @version	
 * @description
 */
public class Singleton {

	private static Singleton singleton;
	private static Logger log = LoggerFactory.getLogger(Singleton.class);

	public Singleton() {
		
	}

	public static Singleton getInstance() {
		if (singleton == null) {

			// avoid race-condition
			synchronized (Singleton.class) {
				singleton = new Singleton();
				log.info(" [INFO] Singleton Initial....");
			}
		}
		return singleton;
	}

}
