package ppms.Sample.Chapter04.framework;

/*

framework 패키지의 Product 클래스는 '제품'을 표현한 클래스입니다.
이 클래스에서는 추상 메소드 use만이 선언되어 있습니다.
구체적인 use의 구현은 모두 Product의 하위 클래스에게 맡기고 있습니다.
이 framework에서는 제품이란 '무엇이든 use할 수 있는(사용할 수 있는) 것'으로 규정하고 있습니다.


 */

public abstract class Product {
	public abstract void use();
}
