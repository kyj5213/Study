package ppms.Sample.Chapter01;

/*

Book 클래스는 책을 나타내는 클래스입니다. 할 수 있는 일은 책 이름을 getName 메소드에서 얻는 일뿐입니다.
책 이름은 생성자(constructor)에서 인스턴스를 초기화할 때 인수로 지정합니다.

 */
public class Book {
	private String name;
	public Book(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}