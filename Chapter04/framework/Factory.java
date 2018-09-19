package ppms.Sample.Chapter04.framework;

/*

framework 패키지의 Factory 클래스에서는 Template Method 패턴이 사용되고 있습니다.
추상 메소드 createProduct에서는 '제품을 만들고', 만든 제품을 추상 메소드 registerProduct에서 '등록'합니다.
'제품을 만들고', '등록'하는 구현은 하위 클래스에서 수행합니다.
이 framework에서 공장이란 'create 메소드에서 Product의 인스턴스를 생성하는 것'으로 규정하고 있습니다.
그리고 create 메소드는 'createProduct에서 제품을 만들어서 registerProduct에서 등록한다'라는 순서로 구현되고 있습니다.

구체적인 구현 내용은 Factory Method 패턴을 적용한 프로그램에 따라 다릅니다.
Factory Method 패턴에서는 인스턴스를 생성할 때 Template Method 패턴을 사용합니다.

 */

public abstract class Factory {
	public final Product create(String owner) {
		System.out.println("* * * * * * * * * * Factory . . . create(owner) : " + owner);
		Product p = createProduct(owner);
		System.out.println("* * * * * * * * * * Factory . . . create(owner) . . . p : " + p);
		registerProduct(p);
		System.out.println("* * * * * * * * * * Factory . . . create(owner) . . . registerProduct(p)");
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
