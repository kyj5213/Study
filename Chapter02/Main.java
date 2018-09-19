package ppms.Sample.Chapter02;

/*

어댑터 역할의 PrintBanner 클래스를 사용해서 Hello라는 문자열을 약하게(괄호를 붙임), 또는 강하게(*사이에) 표시합니다.

 */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}


/*

Main 클래스 내에서는 PrintBanner의 인스턴스를 Print 인터페이스형의 변수로 대입한것에 주의해야 합니다.
이 Main 클래스는 어디까지나 Print라는 인터페이스를 사용해서(즉, printWeak 메소드와 printStrong 메소드를 사용해서) 프로그래밍을 하고 있습니다.
Banner 클래스나 showWithParen 메소드나 showWithAster 메소드는 Main 클래스의 소스 코드 상에서는 완전히 감추어져 있습니다.
마치 노트북이 직류 12볼트만 제공하면 제대로 작동하지만, 작동을 할 수 있도록 어댑터를 통해서 교류 100볼트가 제공되고 있는 것은 모르는 것과 같습니다.

Main 클래스는 PrintBanner 클래스가 어떻게 실현되고 있는지를 모릅니다.
실행되는지 모른다는 것은 Main 클래스를 전혀 변경하지 않고 PrintBanner 클래스의 구현을 바꿀 수도 있다는 것입니다.

 */
