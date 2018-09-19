package ppms.Sample.Chapter05_Ex;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		for (int i = 0; i < 10 ; i++) {
			System.out.println(i + " : " + TicketMaker.getInstance().getNextTickeetNumber());
		}
		System.out.println("End.");
	}
}
