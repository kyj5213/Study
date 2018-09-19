package ppms.Sample.Chapter06;

import ppms.Sample.Chapter06.framework.*;

/*

UnderlinePen 클래스는 MessageBox와 거의 같은 동작을 하지만, ulhar라는 필드가 밑줄로 이용됩니다.
use 메소드는 주어진 문자열을 이중 인용부호로 묶으면서 문자열 부분에 밑줄을 그립니다.
예를 들어 ulchar가 '~'일 때 Hello라는 문자열이 use 메소드에 주어지면
	"Hello"
	~~~~~~~
와 같이 표시됩니다.

 */

public class UnderlinePen implements Product {
	private char ulchar;
	public UnderlinePen(char ulchar) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * UnderlinePen public UnderlinePen(char ulchar) {");
		this.ulchar = ulchar;
	}
	public void use(String s) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * UnderlinePen public void use(String s) {");
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.println(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println(" ");
	}
	public Product createClone() {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * UnderlinePen public Product createClone() {");
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
