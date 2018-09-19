package ppms.Sample.Chapter05;

/*

Main 클래스는 Singleton 클래스를 이용하는 클래스입니다.
여기에서는 singleton 클래스의 getInstance 메소드를 사용해서 Singleton의 인스턴스를 얻고 있습니다.
getInstance 메소드는 두 번 호출되고 있으며, 반환값은 각각 obj1과 obj2에 대입되고 있습니다.
확실히 같은 인스턴스가 얻어지고 있는지 어떤지를 obj1 == obj2라는 식에서 검사하고 있습니다.

 */

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1 == obj2) {
			System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
		} else {
			System.out.println("obj1과 obj2는 다른 인스턴스입니다.");
		}
		System.out.println("End.");
	}
}
