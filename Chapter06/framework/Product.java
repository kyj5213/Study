package ppms.Sample.Chapter06.framework;

/*

Product 인터페이스는 java.lang.Cloneable 인터페이스를 상속하고 있으며, 복제를 가능하게 합니다.
Cloneable 인터페이스에 대해서는 115쪽의 '보강'에서 자세히 설명하겠지만,
이 인터페이스를 구현하고 있는 클래스의 인스턴스는 clone 메소드를 사용해서 자동적으로 복제를 할 수 있습니다.

use 메소드는 '사용하기'위한 것입니다.
'사용하기'가 무엇을 의미하는지는 하위 클래스의 구현에 맡겨져 있습니다.
createClone 메소드는 인스턴스를 복제하기 위한 것입니다.

 */

public interface Product extends Cloneable {
	public abstract void use(String s);
	public abstract Product createClone();
}
