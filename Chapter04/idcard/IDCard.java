package ppms.Sample.Chapter04.idcard;

import ppms.Sample.Chapter04.framework.*;

/*

인식번호 카드를 나타내는 IDCard라는 클래스를 만들어봅시다.
framework에서 분리된 것을 표시하기 위해 idcard 패키지라는 별도의 패키지를 만들고, IDCard 클래스를 제품 product 클래스의 하위 클래스로 정의합니다.

 */

public class IDCard extends Product {
//	private String owner;
//	IDCard(String owner) {
//		System.out.println(owner + "의 카드를 만듭니다.");
//		this.owner = owner;
//	}
//	public void use() {
//		System.out.println(owner + "의 카드를 사용합니다.");
//	}
//	public String getOwner() {
//		System.out.println("* * * * * * * * * * IDCard . . . getOwner()");
//		return owner;
//	}
	
	private String owner;
	private int serial;
	IDCard(String owner, int serial) {
		System.out.println(owner + "(" + serial + ")의 카드를 만듭니다.");
		this.owner = owner;
		this.serial = serial;
	}
	public void use() {
		System.out.println(owner + "(" + serial + ")의 카드를 사용합니다.");
	}
	public String getOwner() {
		System.out.println("* * * * * * * * * * IDCard . . . getOwner()" + owner);
		return owner;
	}
	public int getSerial() {
		System.out.println("* * * * * * * * * * IDCard . . . getSerial() : " + serial);
		return serial;
	}
}
