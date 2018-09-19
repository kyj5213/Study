package ppms.Sample.Chapter02_2;

/*

미리 제공되어 있는 클래스라고 가정

 */

public class Banner {
	private String string;
	public Banner(String string) {
		this.string = string;
	}
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
