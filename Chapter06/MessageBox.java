package ppms.Sample.Chapter06;

import ppms.Sample.Chapter06.framework.*;

/*

MessageBox 클래스는 Product 인터페이스를 구현(implements)하고 있습니다.
decochar 필드는 문자열을 장식과 같이 둘러싸는 문자입니다.
use 메소드는 주어진 문자열을 decochar로 둘러쌉니다.
예를 들어 decochar가 '*'의 경우 "Hello"라는 문자열이 use 메소드에 주어졌다면
	*********
	* Hello *
	*********
와 같이 표시됩니다.

createClone 메소드는 자기 자신을 복제하는 메소드입니다.
여기에서 호출하고 있는 clone 메소드는 복사 가능한 것은 java.lang.Cloneable 인터페이스를 구현하고 있는 클래스쁜입니다.
만약 이 인터페이스가 구현되고 있지 않은 경우에는 예외 CloneNotSupportedException이 발생하기 때문에 try ... catch로 잡아둘 필요가 있습니다.
MessageBox 클래스에서는 Product 인터페이스만 구현되고 있지만 
앞서 보았듯이 Product 인터페이스는 java.lang.Cloneable 인터페이스를 확장한 것이기 때문에 CloneNotSupportedException이 발생하는 경우는 없습니다.
또한 java.lang.Cloneable 인터페이스는 단지 표식을 붙이기 위해 사용하기 때문에 이 인터페이스가 선언하고 있는 메소드는 없습니다.

Java 언어의 clone 메소드는 자신의 클래스(혹은 하위 클래스)에서만 호출할 수 있기 때문에 
다른 클래스의 요청으로 복제를 하는 경우에는 createClone과 같은 다른 메소드를 이용해서 clone을 기술할 필요가 있습니다.

 */

public class MessageBox implements Product {
	private char decochar;
	public MessageBox(char decochar) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * MessageBox public MessageBox(char decochar) {");
		this.decochar = decochar;
	}
	public void use(String s) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * MessageBox public void use(String s) {");
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println(" ");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println(" ");
	}
	public Product createClone() {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * MessageBox public Product createClone() {");
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
