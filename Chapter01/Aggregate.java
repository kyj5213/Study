package ppms.Sample.Chapter01;

/*

Aggregate 인터페이스는 요소들이 나열되어있는 '집합체'를 나타냅니다.
이 인터페이스를 구현하고 있는 클래스는 배열과 같이 무엇인가가 많이 모여 있습니다.
aggregate는 '모으다', '모이다', '집합'이라는 의미입니다.

Aggregate 인터페이스에서 선언되어 있는 메소드는 iterator 메소드 하나뿐입니다.
이 메소드는 집합체에 대응하는 Iterator를 1개 작성하기 위한 것입니다.

집합체를 하나씩 나열하고, 검색하고, 조사하고 싶을 때에는 iterator 메소드를 사용해서
Iterator 인터페이스를 구현한 클래스의 인스턴스를 1개 만듭니다.

 */

public interface Aggregate {
	public abstract Iterator iterator();
}