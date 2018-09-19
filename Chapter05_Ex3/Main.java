package ppms.Sample.Chapter05_Ex3;

public class Main extends Thread {
	public static void main(String[] args) {
		System.out.println("Start.");
		new Main("A").start();
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * A B");
		new Main("B").start();
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * B C");
		new Main("C").start();
		System.out.println("End.");
	}
	public void run() {
		Singleton obj = Singleton.getInstance();
		System.out.println(getName() + " : obj = " + obj);
	}
	public Main(String name) {
		super(name);
	}
}
