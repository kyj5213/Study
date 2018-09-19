package ppms.Sample.Chapter05_Ex2;

/*

연습문제
인스턴스의 개수가 3개로 한정되어 있는 클래스 Triple을 만드십시오.
인스턴스에는 0,1,2라는 번호가 붙어있고 getInstance(int id)에서 id번의 인스턴스가 얻어진다고 가정합니다.

해답
Triple 클래스의 인스턴스는 자신의 번호(id)를 갖는다고 가정합니다.
static 변수로서 배열 triple을 가지며 그곳의 세 개의 인스턴스를 만들어 둡니다.
getInstance 메소드는 인수에서 제공된 id를 첨자로 하고, 배열 triple에서 인스턴스를 하나만 반환합니다.
Triple의 인스턴스를 문자열로 표시했을 때 id를 알 수 있도록 toString 메소드를 작성해둡니다.

클래스 필드에 익숙하지 않은 독자가 주의할 점
Triple 클래스의 triple 필드를 Triple의 인스턴스에서 초기화하고 있습니다.
이것은 무한 루프가 되지 않습니다. 자신을 만들기 위해서 자신을 필요로 하는것 같지만, 그것은 착각입니다.
무한 루프가 되지 않는 것은 triple 필드가 인스턴스 필드가 아니라, 클래스 필드이기 때문입니다.
triple 필드가 초기화되는 것은  최초의 한 번뿐이고, Triple 클래스의 인스턴스를 만들 때마다 triple 필드가 만들어지는 것은 아닙니다.
만약, triple 필드에 static을 사용하지 않으면 무한루프가 되어 실행 시에 에러(스택 오버플로우)가 발생합니다.

 */

public class Triple {
	private static Triple[] triple = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2),
	};
	private int id;
	private Triple(int id) {
		System.out.println("The instance " + id + " is created.");
		this.id = id;
	}
	public static Triple getInstance(int id) {
		System.out.println("* * * * * * * * * * public static Triple getInstance(int id) _ id : " + id);
		return triple[id];
	}
	public String toString() {
		System.out.println("* * * * * * * * * * public String toString() ");
		return "[Triple id = " + id + "]";
	}
}
