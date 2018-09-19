package ppms.Sample.Chapter06.framework;

import java.util.*;

/*

Manager 클래스는 Product 인터페이스를 이용해서 인스턴스의 복제를 실행하는 클래스입니다.
showcase 필드는 인스턴스의 '이름'과 '인스턴스'의 대응관계를 java.util.HashMap으로 표현하였습니다.

register 메소드에서 제품의 이름과 Product 인터페이스가 주어지면 그 한 쌍을 showcase에 등록합니다.
여기에서 인수에 전달되는 Product형의 proto는 무엇일까요?
그 실제 클래스는 모르지만 Product 인터페이스를 구현한 클래스의 인스턴스(즉, use 메소드나 createClone 메소드를 호출할 수 있는 인스턴스)라는 것을 알 수 있습니다.

Product 인터페이스나 Manager 클래스의 소수에 MessageBox 클래스나 UnderlinePen 클래스의 클래스 이름이 전혀 나오지 않는 점에 주의하십시오.
클래스 이름이 나오지 않는다는 것은 PRoduct와 Manager는 그들의 클래스와는 독립적으로 수정할 수 있다는 것을 의미합니다.
이것은 매우 중요한 포인트입니다. 소스 안에 클래스의 이름을 쓰면 그 클래스와 밀접한 관계가 생깁니다.
Manager 클래스에서는 구체적인 개개의 클래스 이름을 쓰지 않고 단지 Product라는 인터페이스 이름만 사용하고 있습니다.
이 인터페이스만이 Manager 클래스와 다른 클래스의 다리 역할을 합니다.

 */

public class Manager {
	private HashMap showcase = new HashMap();
	public void register(String name, Product proto) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * Manager public void register(String name, Product proto) {");
		showcase.put(name, proto);
	}
	public Product create(String protoname) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * Manager public Product create(String protoname) {");
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}
}
