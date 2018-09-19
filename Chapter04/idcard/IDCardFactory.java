package ppms.Sample.Chapter04.idcard;

import java.util.*;

import ppms.Sample.Chapter04.framework.*;

/*

IDCardFactory 클래스에서는 createProduct와 registerProduct의 두 가지 메소드를 구현하고 있습니다.
createProduct에서는 IDCard의 인스턴스를 생성해서 '제품을 만드는'일을 실현하고 있습니다.
registerProduct에서는 IDCard의 owner(소유자)를 owners 필드에 추가해서 '등록'이라는 기능을 실현하고 있습니다.

 */

public class IDCardFactory extends Factory {
//	private List owners = new ArrayList();
//	protected Product createProduct(String owner) {
//		System.out.println("* * * * * * * * * * IDCardFactory . . . createProduct(owner)");
//		return new IDCard(owner);
//	}
//	protected void registerProduct(Product product) {
//		System.out.println("* * * * * * * * * * IDCardFactory . . . registerProduct(product)");
//		owners.add(((IDCard)product).getOwner());
//	}
//	public List getOwners() {
//		System.out.println("* * * * * * * * * * IDCardFactory . . . getOwners()");
//		return owners;
//	}

	private HashMap database = new HashMap();
	private int serial = 100;
	protected synchronized Product createProduct(String owner) {
		System.out.println("* * * * * * * * * * IDCardFactory . . . createProduct(String owner) : " + owner);
		return new IDCard(owner, serial++);
	}
	protected void registerProduct(Product product) {
		System.out.println("* * * * * * * * * * IDCardFactory . . . registerProduct(Product product) : product : " + product);
		IDCard card = (IDCard)product;
		System.out.println("* * * * * * * * * * IDCardFactory . . . registerProduct(Product product) : card : " + card);
		database.put(new Integer(card.getSerial()), card.getOwner());
		System.out.println("* * * * * * * * * * IDCardFactory . . . registerProduct(Product product) : database : " + database);
	}
	//public Hashtable getDatabase() {
	public HashMap getDatabase() {
		return database;
	}
}
