package ppms.Sample.Chapter02;

/*

어댑터의 역할.
준비된 Banner 클래스를 확장(extends)해서 showWithParen 메소드와 showWithAster 메소드를 상속합니다.
또한, 필요한 Print 인터페이스를 구현(implements)해서 printWeak 메소드와 printStrong 메소드를 구현.

 */
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}
	public void printWeak() {
		showWithParen();
	}
	public void printStrong() {
		showWithAster();
	}
}
