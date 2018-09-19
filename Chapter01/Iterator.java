package ppms.Sample.Chapter01;

/*

다음으로 Iterator 인터페이스를 살펴봅시다. Iterator 인터페이스는 요소를 하나씩 나열하면서 루프 변수와 같은 역할을 수행합니다.
Iterator에는 어떤 메소드가 필요할까요? 다양한 기법이 있지만, 여기서는 가장 단순한 형태의 Iterator 인터페이스를 만들어보았습니다.

여기에 선언되어 있는 메소드는 2개입니다. '다음 요소'가 존재하는지를 조사하기 위한 hasNext 메소드와 '다음 요소'를 얻기 위한 next 메소드입니다.
hasNext 메소드의 반환값이 boolean형인 이유가 이해될 것입니다. 다음 요소가 존재하면 이 메소드는 true를 반환하고, 
다음 요소가 존재하지 않는 마지막 요소라면 이 메소드의 반환값은 false가 됩니다. 즉, hasNext 메소드를 루프의 종료 조건으로 사용하기 위해서입니다.

next 메소드는 약간의 설명이 필요합니다. 반환값의 형태가 Object로 되어있는 것에서 알 수 있듯이 next 메소드는 집합체의 요소를 1개 반환해 줍니다.
그러나 next 메소드의 역할은 그것만이 아닙니다. 다음 next 메소드를 호출했을 때 정확히 다음 요소를 반환하도록 내부 상태를 다음으로 진행시켜 두는 역할이 뒤에 숨어 있습니다.
그러나 '뒤에 숨어 있다'고 하더라도  Iterator 인터페이스에서는 메소드 이름만 알 수 있습니다.
구체적인 역할은 Iterator 인터페이스를 구현하고 있는 클래스(BookShelfIterator)에서 살펴봅시다.
그러면 next 메소드의 역할이 좀 더 확실해 질 것입니다. 

 */

public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}