package ppms.Sample.Chapter05_Ex2;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		for (int i = 0; i < 9; i++) {
			System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
			Triple triple = Triple.getInstance(i % 3);
			System.out.println(i + " : " + triple);
		}
		System.out.println("End.");
	}
}
