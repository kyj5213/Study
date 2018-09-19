package ppms.Sample.Chapter05;

/*

Singleton 클래스에서는 인스턴스를 1개 밖에 만들 수 없으며, singleton은 static 필드(클래스 변수)로서 Singleton 클래스를 로드할 때 1회만 실행됩니다.

Singleton 클래스의 생성자는 private로 되어 있습니다. 이것은 Singleton 클래스 외부에서 생성자의 호출을 금지하기 위해서입니다. 만약
	new Singleton()
이라는 식이 이 클래스의 외부에 있더라도 컴피일 시에는 에러가 발생합니다. 처음부터 프로그래머가 주의해서 new하지 않도록 하면 생성자를 private로 할 필요는 없습니다.
그러나 그렇게 되면 Singleton 패턴이 존재하는 의미가 없습니다. Singleton 패턴은 프로그래머가 실수를 해도 인스턴스가 1개만 생성되도록 보증하는 패턴입니다.
이것을 보증하기 위해서 생성자를 private로 해둘 필요가 있습니다.

여기에서 동작의 상태를 확인하기 위해서 생성자 안에서 '인스턴스를 생성했습니다.'라는 메시지를 표시하고 있습니다. 
Singleton 클래스의 유일한 인스턴스를 얻는 메소드로서 getInstance가 준비되어 있습니다.
예제 프로그램에서는 메소드의 이름을 getInstance로 했지만, 반드시 이 이름일 필요는 없습니다. 그러나 유일한 인스턴스를 얻을 메소드는 필요합니다. 

 */

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}




