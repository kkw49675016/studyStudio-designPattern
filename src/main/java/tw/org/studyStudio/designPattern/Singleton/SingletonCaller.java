package tw.org.studyStudio.designPattern.Singleton;

public class SingletonCaller {
	
	public static void main(String[] args) {
		
		// Only Show once initial message
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}

}
