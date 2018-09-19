package ppms.Sample.Chapter05_Ex3;

public class Singleton {
	private static Singleton singleton = null;
	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
		slowdown();
	}
	//public static Singleton getInstance() {
	public static synchronized Singleton getInstance() { // 엄격한 Singleton 패턴을 위해 synchronized 사용
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * Singleton getInstance() : singleton : " + singleton);
		if (singleton == null) {
			System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * Singleton getInstance() >> if (singleton == null) { singleton : " + singleton);
			singleton = new Singleton();
		}
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * Singleton getInstance() : singleton return : " + singleton);
		return singleton;
	}
	private void slowdown() {
		try {
			System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * private void slowdown() {");
			Thread.sleep(1000);
		} catch (InterruptedException e){
			
		}
	}
}
